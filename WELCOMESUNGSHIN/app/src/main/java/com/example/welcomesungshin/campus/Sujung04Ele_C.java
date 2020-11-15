package com.example.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.welcomesungshin.R;

public class Sujung04Ele_C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sujung04__c);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }

    public void clickedToSujung05Ele_A(View v) {
        Intent intent = new Intent(this, Sujung05Ele_A.class);
        startActivity(intent);
    }

    public void clickedToSungToSuBridge(View v) {
        Intent intent = new Intent(this, SungToSuBridge.class);
        startActivity(intent);
    }


    public void clickedToSujung02Ele(View v) {
        Intent intent = new Intent(this, Sujung02Ele.class);
        startActivity(intent);
    }
}
