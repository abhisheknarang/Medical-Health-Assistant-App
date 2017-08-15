package com.example.harshitbansal.selectcategory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ent);
    }
    public void kumudh(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse(""));
        startActivity(callintent);
    }
    public void shashidhir(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/gurgaon/doctor/dr-shashidhar-tb-ear-nose-throat-ent-specialist"));
        startActivity(callintent);
    }
    public void harishm(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-harish-madan-ear-nose-throat-ent-specialist"));
        startActivity(callintent);
    }
    public void bk(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-b-k-agarwal-ear-nose-throat-ent-specialist-1"));
        startActivity(callintent);
    }
    public void rahuls(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-rahul-sharma-ear-nose-throat-ent-specialist-1"));
        startActivity(callintent);
    }
    public void mahesha(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-mahesh-anand-ear-nose-throat-ent-specialist"));
        startActivity(callintent);
    }
    public void vijayv(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/gurgaon/doctor/vijay-verma-1-ear-nose-throat-ent-specialist"));
        startActivity(callintent);
    }
    public void darius(View view)
    {
        Intent callintent=new Intent(Intent.ACTION_VIEW);
        callintent.setData(Uri.parse("https://www.practo.com/delhi/doctor/dr-d-jijina-ear-nose-throat-ent-specialist"));
        startActivity(callintent);
    }
}
