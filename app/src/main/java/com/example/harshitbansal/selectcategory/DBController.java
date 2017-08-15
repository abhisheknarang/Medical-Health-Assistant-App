package com.example.harshitbansal.selectcategory;

/**
 * Created by harshit bansal on 30-06-2017.
 */
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;

public class DBController  extends SQLiteOpenHelper {

    private static final String databasename = "SignUp";
    private static final int versioncode = 1;
    private static final String tablename= "User";
    private static final String name="Name";
    private static final String email="Email";
    private static final String phone="Phone_Number";
    private static final String pw="Password";
    private static final String id="ID";
    String password;

    public DBController(Context context, Object o, Object o1, int i){
        super(context, databasename,null, versioncode);
    }



    @Override
    public void onCreate(SQLiteDatabase database) {
        String query;
        query = "CREATE TABLE IF NOT EXISTS " + tablename + "(" + id + " INTEGER PRIMARY KEY," +
                name + " TEXT," + phone + " INTEGER," + email + " TEXT," + pw + " TEXT " + ")";
        database.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int i, int i1) {
        try {
            String query;
            query = "DROP TABLE IF EXISTS " + tablename;
            database.execSQL(query);
            onCreate(database);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public ArrayList<HashMap<String, String>> userData()
    {

        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
        try {
            String selectQuery = " SELECT * FROM " + tablename;
            SQLiteDatabase database = this.getWritableDatabase();
            Cursor cursor = database.rawQuery(selectQuery, null);
            if (cursor.moveToFirst()) {
                do {
                    HashMap<String, String> map = new HashMap<String, String>();
                    map.put("ID", cursor.getString(0));
                    map.put("Name", cursor.getString(1));
                    map.put("Phone_Number", cursor.getString(2));
                    map.put("Email", cursor.getString(3));
                    map.put("Password", cursor.getString(4));
                    list.add(map);
                } while (cursor.moveToNext());
            }}
        catch(Exception e) {
            e.printStackTrace();
        }                return list;}


    //code to get the register
    String getregister(String username){
        SQLiteDatabase db = this.getReadableDatabase();
        //String selectquery="SELECT * FROM TABLE_REGISTER";
        Cursor cursor=db.query(tablename,null,  "email=?",new String[]{username},null, null, null, null);

        if(cursor.getCount()<1){
            cursor.close();
            return "Not Exist";
        }
        else if(cursor.getCount()>=1 && cursor.moveToFirst()){

            password = cursor.getString(cursor.getColumnIndex(pw));

            cursor.close();

        }
        return password;


    }

}

