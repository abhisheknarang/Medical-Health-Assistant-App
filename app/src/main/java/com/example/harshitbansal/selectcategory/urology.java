package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class urology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urology);
    }
    public void chandrakant(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void narmadap(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void rajiba(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void dmanu(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void svk(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void brijesh(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void hardev(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void pankajw(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
}
