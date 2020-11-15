package com.example.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.welcomesungshin.R;

public class Sujung01Nancho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sujung01_nancho);
        getWindow().setWindowAnimations(0);
    }
    public void clickedToSchoolMap(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }

    public void clickedToSujung01Ele(View v) {
        Intent intent = new Intent(this, Sujung01.class);
        startActivity(intent);
    }

    public void clickedToSujung01SleepingRoom(View v) {
        Intent intent = new Intent(this, Sujung01SleepingRoom.class);
        startActivity(intent);
    }
}
