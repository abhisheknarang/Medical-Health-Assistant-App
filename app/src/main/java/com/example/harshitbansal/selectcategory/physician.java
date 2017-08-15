package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class physician extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physician);
    }
    public void sarthakc(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void rkj(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void rkg(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void dsunil(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void rahuln(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void yoginderg(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void akashj(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void suman(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
}
