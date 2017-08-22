package com.example.harshitbansal.selectcategory;

import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    EditText email;
    EditText pw;
    DBController db;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);


        email = (EditText) findViewById(R.id.editText5);
        pw = (EditText) findViewById(R.id.editText8);
    }
    public void signUp(View v){
        Intent i= new Intent(this, SignUp.class);
        startActivity(i);
    }

    public void login(View v){
        db = new DBController(LoginPage.this, null, null, 2);
        String username = email.getText().toString();
        String password = pw.getText().toString();
        String StoredPassword = db.getregister(username);
        if(email.getText().toString().equals("admin")&&pw.getText().toString().equals("admin")){
            Toast.makeText(getApplicationContext(), "Welcome Admin", Toast.LENGTH_LONG).show();
            Intent i= new Intent(this, UserBase.class);
            startActivity(i);
        }
        else if(password.equals(StoredPassword))
        {
            Toast.makeText(getApplicationContext(), username + " Login Successfully", Toast.LENGTH_LONG).show();
             final ProgressDialog progress = new ProgressDialog(this);
            progress.setTitle("Signing In");
            progress.setMessage("Loading.Please Wait...");
            progress.show();
            Runnable progressRunnable = new Runnable() {
                @Override
                public void run() {
                    progress.cancel();
                }
            };
            Handler pdCanceller = new Handler();
            pdCanceller.postDelayed(progressRunnable, 3000);
            Intent i = new Intent(LoginPage.this,slider.class);
            startActivity(i);
        }
        else{
            Toast.makeText(getApplicationContext(), "Username/Password incorrect", Toast.LENGTH_LONG).show();
            email.setText("");
            pw.setText("");
        }

    }
}
