package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class neuro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neuro);
    }
    public void kewalk(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void amitabhv(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void pk(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void anands(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void adityag(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void sanjayc(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void isha(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void atulp(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
}
