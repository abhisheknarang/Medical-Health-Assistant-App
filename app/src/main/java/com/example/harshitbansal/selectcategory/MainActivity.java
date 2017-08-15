package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void ayurveda(View view)
    {
        Intent i=new Intent(MainActivity.this,ayurveda.class);
        startActivity(i);
    }
    public void paediatrics(View view)
    {
        Intent i=new Intent(MainActivity.this,paediatrics.class);
        startActivity(i);
    }
    public void dental(View view)
    {
        Intent i=new Intent(MainActivity.this,dental.class);
        startActivity(i);
    }
    public void derma(View view)
    {
        Intent i=new Intent(MainActivity.this,derma.class);
        startActivity(i);
    }
    public void diab(View view)
    {
        Intent i=new Intent(MainActivity.this,diab.class);
        startActivity(i);
    }
    public void diet(View view)
    {
        Intent i=new Intent(MainActivity.this,diet.class);
        startActivity(i);
    }
    public void ent(View view)
    {
        Intent i=new Intent(MainActivity.this,ent.class);
        startActivity(i);
    }
    public void ophtal(View view)
    {
        Intent i=new Intent(MainActivity.this,ophtal.class);
        startActivity(i);
    }
    public void gas(View view)
    {
        Intent i=new Intent(MainActivity.this,gas.class);
        startActivity(i);
    }
    public void physician(View view)
    {
        Intent i=new Intent(MainActivity.this,physician.class);
        startActivity(i);
    }
    public void cardio(View view)
    {
        Intent i=new Intent(MainActivity.this,cardio.class);
        startActivity(i);
    }
    public void neuro(View view)
    {
        Intent i=new Intent(MainActivity.this,neuro.class);
        startActivity(i);
    }
    public void physio(View view)
    {
        Intent i=new Intent(MainActivity.this,physio.class);
        startActivity(i);
    }
    public void urology(View view)
    {
        Intent i=new Intent(MainActivity.this,urology.class);
        startActivity(i);
    }
    public void ortho(View view)
    {
        Intent i=new Intent(MainActivity.this,ortho.class);
        startActivity(i);    }
}
