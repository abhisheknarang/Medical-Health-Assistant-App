package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class diet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);
    }
    public void sonian(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/therapist/dr-sonia-narang-dietitian-nutritionist"));
        startActivity(callintent);
    }
    public void divyag(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/therapist/mrs-divya-gandhi-dietitian-nutritionist"));
        startActivity(callintent);
    }
    public void shwetan(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/therapist/dr-shweta-nakra-dietitian-nutritionist-1"));
        startActivity(callintent);
    }
    public void preetig(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://t.justdial.com/Delhi-NCR/Dr-Preeti-Puri-Grover-On-The-Main-MBlock-Market-Road-Greater-Kailash-2/011PXX11-XX11-140709181516-D1Y1_BZDET"));
        startActivity(callintent);
    }
    public void sangeetas(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.google.co.in/amp/s/www.lybrate.com/amp/chandigarh/doctor/dt-sangeeta-singh-dietitian-nutritionist"));
        startActivity(callintent);
    }
    public void shwetas(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/therapist/dr-shweta-dewan-dietitian-nutritionist"));
        startActivity(callintent);
    }
    public void lovneetb(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/therapist/lovneet-batra-1-dietitian-nutritionist"));
        startActivity(callintent);
    }
    public void namitan(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/noida/therapist/dr-namita-nadar-dietitian-nutritionist"));
        startActivity(callintent);
    }
}
