package com.example.harshitbansal.selectcategory;
 
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class About extends AppCompatActivity
{
  @Override
  protected void onCreate(Bundle bundle)
  {
    super.onCreate(bundle);
    setContentView(R.layout.aboutalarm);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
  }
}

