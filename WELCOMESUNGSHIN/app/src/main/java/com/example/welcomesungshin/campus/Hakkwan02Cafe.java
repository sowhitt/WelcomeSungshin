package com.example.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.welcomesungshin.R;

public class Hakkwan02Cafe extends AppCompatActivity {

    Hakkwan01Ele hakkwan01Ele = (Hakkwan01Ele)Hakkwan01Ele.Hakkwan01Ele;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        hakkwan01Ele.finish();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkwan02_cafe);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }

    public void clickedToHakkwan02CafeIn(View v) {
        Intent intent = new Intent(this, Hakkwan02CafeIn.class);
        startActivity(intent);
    }

    public void clickedToHakkwan04Cafe(View v) {
        Intent intent = new Intent(this, Hakkwan04Cafe.class);
        startActivity(intent);
    }
    public void clickedToHakkwan01Ele(View v) {
        Intent intent = new Intent(this, Hakkwan01Ele.class);
        startActivity(intent);
    }

}
