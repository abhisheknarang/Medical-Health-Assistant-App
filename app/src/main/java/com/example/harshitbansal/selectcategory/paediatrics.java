package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class paediatrics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paediatrics);
    }
    public void latikab(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void ashishg(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void rameshd(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void vra(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void vandanak(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void anjub(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void nps(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void sanjivm(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
}
