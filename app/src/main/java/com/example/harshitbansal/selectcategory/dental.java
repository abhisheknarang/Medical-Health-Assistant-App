package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dental extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dental);
    }
    public void saurabh(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-sourabh-nagpal-dentist-dentist"));
        startActivity(callintent);
    }
    public void gaurav(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-gaurav-gupta-dentist-8"));
        startActivity(callintent);
    }
    public void sumanto(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-sumanto-bagchi-dentist-1"));
        startActivity(callintent);
    }
    public void animesh(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-animesh-agarwal-dentist"));
        startActivity(callintent);
    }
    public void poonam(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-poonam-nagpal-dentist"));
        startActivity(callintent);
    }
    public void meenakshi(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-minakshi-soni-dentist-2"));
        startActivity(callintent);
    }
    public void gauravg(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-gaurav-gyan-dentist"));
        startActivity(callintent);
    }
    public void nikhilb(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://t.justdial.com/Delhi-NCR/Dr-Nikhil-Bahuguna-(Demystifying-Smiles)-Sector-53/011PXX11-XX11-150803173258-E7J5_BZDET"));
        startActivity(callintent);
    }
}
