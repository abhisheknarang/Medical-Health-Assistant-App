package com.example.harshitbansal.selectcategory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;

public class UserBase extends AppCompatActivity {

    DBController controller;
    ListView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_base);
        controller = new DBController(this, null, null, 2);
        ls = (ListView) findViewById(R.id.userBase);
        try {

            List<HashMap<String, String>> data = controller.userData();

            if (data.size() != 0) {
                SimpleAdapter adapter = new SimpleAdapter(
                        UserBase.this, data, R.layout.raw,
                        new String[]{"ID", "Name", "Phone_Number", "Email", "Password"},
                        new int[]{R.id.id, R.id.name, R.id.phone, R.id.email, R.id.pw});
                ls.setAdapter(adapter);
            } else {
                Toast.makeText(this, "No data in database", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage().toString(), Toast.LENGTH_LONG).show();
        }
    }

}
