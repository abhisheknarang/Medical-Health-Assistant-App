package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class gas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas);
    }
    public void rahulg(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-rahul-gupta-gastroenterologist"));
        startActivity(callintent);
    }
    public void randhirs(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse(""));
        startActivity(callintent);
    }
    public void deepakl(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-deepak-lahoti-1-gastroenterologist"));
        startActivity(callintent);
    }
    public void sanjayk(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/sanjay-khanna-1-gastroenterologist"));
        startActivity(callintent);
    }
    public void pallavig(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/drpallavigindodia-yahoo-com-gastroenterologist-1"));
        startActivity(callintent);
    }
    public void nareshb(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/naresh-bansal-gastroenterologist-gastroenterologist"));
        startActivity(callintent);
    }
    public void rajneeshg(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-rajneesh-gulati-gastroenterologist-7"));
        startActivity(callintent);
    }
    public void nirmalk(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/gurgaon/doctor/dr-nirmal-kumar-1-gastroenterologist"));
        startActivity(callintent);
    }
}
