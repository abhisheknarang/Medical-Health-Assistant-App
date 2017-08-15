package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class diab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diab);
    }
    public void atulg(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-atul-gogia-internal-medicine"));
        startActivity(callintent);
    }
    public void sunils(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.lybrate.com/delhi/doctor/dr-sunil-sekhri-general-physician"));
        startActivity(callintent);
    }
    public void atull(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/gurgaon/doctor/dr-atul-luthra-endocrinologist"));
        startActivity(callintent);
    }
    public void rajivag(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-rajeev-gupta-internal-medicine"));
        startActivity(callintent);
    }
    public void yuvrajm(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-yuvraj-arora-monga-sexologist"));
        startActivity(callintent);
    }
    public void sujeetj(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/sangeeta-gupta-physiotherapist"));
        startActivity(callintent);
    }
    public void sanjayg(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/gurgaon/doctor/dr-sujeet-jha-1-dentist"));
        startActivity(callintent);
    }
    public void sumank(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://t.justdial.com/Delhi-NCR/Dr-Suman-Kirti-%3Cnear%3E-Sukhdev-Vihar/011PXX11-XX11-121029164752-D9F4_BZDET"));
        startActivity(callintent);
    }
}
