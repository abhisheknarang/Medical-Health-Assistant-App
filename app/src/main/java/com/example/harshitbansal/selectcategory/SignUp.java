package com.example.harshitbansal.selectcategory;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    DBController controller;
    EditText name, phone, email, pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        controller = new DBController(this, null, null, 2);
        name= (EditText) findViewById(R.id.editText);
        phone= (EditText) findViewById(R.id.editText2);
        email= (EditText) findViewById(R.id.editText3);
        pw= (EditText) findViewById(R.id.editText4);
        name= (EditText) findViewById(R.id.editText);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void login(View v){
        Intent i= new Intent(SignUp.this, LoginPage.class);
        startActivity(i);
    }
    public void signUp(View v) {
        SQLiteDatabase db = controller.getWritableDatabase();
        try {
            if (name.getText().toString().trim().equals(""))
            {
                Toast.makeText(this, "Insert your name", Toast.LENGTH_SHORT).show();
            }
            else if (phone.getText().toString().trim().equals(""))
            {
                Toast.makeText(this, "Insert your phone number", Toast.LENGTH_SHORT).show();
            }
            else if (email.getText().toString().trim().equals(""))
            {
                Toast.makeText(this, "Insert your Email", Toast.LENGTH_SHORT).show();
            }
            else if (pw.getText().toString().trim().equals(""))
            {
                Toast.makeText(this, "Insert your password", Toast.LENGTH_SHORT).show();
            }
            else
            {      //         Toast.makeText(this, "Test 1", Toast.LENGTH_SHORT).show();

                controller = new DBController(getApplicationContext(), null, null, 2);
                //Toast.makeText(this, "Test 2", Toast.LENGTH_SHORT).show();
                ContentValues cv = new ContentValues();
                //Toast.makeText(this, "Test 3", Toast.LENGTH_SHORT).show();
                cv.put("Name", name.getText().toString());
                cv.put("Phone_Number", phone.getText().toString());
                cv.put("Email", email.getText().toString());
                cv.put("Password", pw.getText().toString());
                db.insert("User", null, cv);
                db.close();
                Toast.makeText(this, "Sign Up Successful. Please Login now.", Toast.LENGTH_LONG).show();
                Intent i = new Intent(this, LoginPage.class);
                startActivity(i);
            }
        }
        catch (Exception e) {
            // Toast.makeText(this, System.out.println(e.getMessage()), Toast.LENGTH_LONG).show();
        }
    }
}
