package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ayurveda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayurveda);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void jyoti(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/gurgaon/doctor/dr-jyoti-arora-ayurveda"));
        startActivity(callintent);
    }
    public void manu(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-manu-rajput-ayurveda"));
        startActivity(callintent);
    }
    public void nitika(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-nitika-sharma-kohli-ayurveda"));
        startActivity(callintent);
    }
    public void ankur(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-ankur-40-ayurveda"));
        startActivity(callintent);
    }
    public void preeti(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.lybrate.com/delhi/doctor/dr-preeti-chhabra-ayurveda"));
        startActivity(callintent);
    }
    public void shailesh(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-shailesh-jain-ayurveda-1"));
        startActivity(callintent);
    }
    public void mahesh(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-shah-4-sexologist"));
        startActivity(callintent);
    }
    public void gkrish(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/gurgaon/doctor/dr-g-geeta-krishnan-ayurveda"));
        startActivity(callintent);
    }
}
