package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
    private Thread splashThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        splashThread = new Thread(){
            @Override
            public void run() {
                try {
                    synchronized(this) {
                        wait(2500);
                    }
                } catch (InterruptedException ex){
                }
                finish();
                Intent i=new Intent(SplashScreen.this,LoginPage.class);
                startActivity(i);
            }

        };
        splashThread.start();
    }
}