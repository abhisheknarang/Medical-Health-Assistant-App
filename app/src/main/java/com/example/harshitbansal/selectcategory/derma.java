package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class derma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derma);
    }
    public void sanjivk(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-sanjiv-kandhari-dermatologist-cosmetologist-1"));
        startActivity(callintent);
    }
    public void geetikam(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-geetika-mittal-gupta-dermatologist-cosmetologist"));
        startActivity(callintent);
    }
    public void niveditad(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-nivedita-dadu-dermatologist-cosmetologist"));
        startActivity(callintent);
    }
    public void pritamp(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-p-pankaj-dermatologist-cosmetologist"));
        startActivity(callintent);
    }
    public void amrendrak(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-amrendra-kumar-dermatologist-cosmetologist"));
        startActivity(callintent);
    }
    public void nirupama(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-nirupama-parwanda-dermatologist-cosmetologist-1"));
        startActivity(callintent);
    }
    public void avinash(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/gurgaon/doctor/dr-avnish-sharma-dermatologist-cosmetologist-1"));
        startActivity(callintent);
    }
    public void tipesh(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-tapesh-sharma-dermatologist"));
        startActivity(callintent);
    }
}
