package com.example.harshitbansal.selectcategory;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class emergency1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void process(View view)
    {
        Intent intent=null;
        if (view.getId()==R.id.launchmap)
        {
            intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:28.613,77.209"));
            startActivity(intent);
        }
    }
    public void callno(View view)
    {
        if ((ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE))!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 50);
        }
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent = callIntent.setData(Uri.parse("tel:9999331666"));
        startActivity(callIntent);
    }
}
