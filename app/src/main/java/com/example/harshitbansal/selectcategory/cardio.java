package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cardio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);
    }
    public void balbir(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-dhananjay-kumar-jhamb-cardiac-surgeon"));
        startActivity(callintent);
    }
    public void dhanajay(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-sanjay-sharma-cardiologist-1"));
        startActivity(callintent);
    }
    public void kasliwala(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-subrata-lahiri-cardiologist-2"));
        startActivity(callintent);
    }
    public void sanjays(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/technician/pankaj-kumar-singh-optometrist-1"));
        startActivity(callintent);
    }
    public void subratal(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-sumeet-sethi-cardiologist-1"));
        startActivity(callintent);
    }
    public void pankaj(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://t.justdial.com/Delhi-NCR/Dr-Amit-Bhushan-Sharma-Sector-51/011PXX11-XX11-140730180905-J3N5_BZDET"));
        startActivity(callintent);
    }
    public void sumeeth(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-mohan-nair-cardiologist"));
        startActivity(callintent);
    }
    public void amit(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://t.justdial.com/Delhi-NCR/Dr-Amit-Pendharkar-Kirti-Nagar/011PXX11-XX11-131108125004-Z2T7_BZDET"));
        startActivity(callintent);
    }
}
