package com.example.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.welcomesungshin.R;

public class Sujung01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sujung01);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }

    public void clickedToSujung02Ele(View v) {
        Intent intent = new Intent(this, Sujung02Ele.class);
        startActivity(intent);
    }

    public void clickedToSujung01JobCenter(View v) {
        Intent intent = new Intent(this, Sujung01JobCenter.class);
        startActivity(intent);
    }

    public void clickedToSujung01BluePot(View v) {
        Intent intent = new Intent(this, Sujung01Bluepot.class);
        startActivity(intent);
    }

    public void clickedToSujungkwan(View v) {
        Intent intent = new Intent(this, sujungkwan.class);
        startActivity(intent);
    }


    public void clickedToSujung01Nancho(View v) {
        Intent intent = new Intent(this, Sujung01Nancho.class);
        startActivity(intent);
    }
}
