package com.example.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.welcomesungshin.R;

public class Sujung02Ele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sujung02_ele);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }

    public void clickedToSujung04Ele_C(View v) {
        Intent intent = new Intent(this, Sujung04Ele_C.class);
        startActivity(intent);
    }

    public void clickedToSujung02JobCafe(View v) {
        Intent intent = new Intent(this, Sujung02JobCafe.class);
        startActivity(intent);
    }

    public void clickedToSujung02Ubi(View v) {
        Intent intent = new Intent(this, Sujung02Ubi.class);
        startActivity(intent);
    }

    public void clickedToSujung01Ele(View v) {
        Intent intent = new Intent(this, Sujung01.class);
        startActivity(intent);
    }
}
