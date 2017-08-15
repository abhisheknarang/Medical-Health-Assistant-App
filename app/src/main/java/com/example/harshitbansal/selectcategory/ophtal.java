package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ophtal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ophtal);
    }
    public void anitas(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void hc(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void sp(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void vivekg(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void shishir(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void tinku(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void sanjivg(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
    public void paruls(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("http://www.google.co.in"));
        startActivity(callintent);
    }
}
