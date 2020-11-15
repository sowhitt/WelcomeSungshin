package com.example.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.welcomesungshin.R;

public class Nan03Ele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nan03_ele);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }

    public void clickedToNanStuRes(View v) {
        Intent intent = new Intent(this, NanStuRes.class);
        startActivity(intent);
    }

    public void clickedToNan01Ele(View v) {
        Intent intent = new Intent(this, Nan01Ele.class);
        startActivity(intent);
    }

    public void clickedToNan07Ele(View v) {
        Intent intent = new Intent(this, Nan07Ele.class);
        startActivity(intent);
    }

    public void clickedToNanPark(View v) {
        Intent intent = new Intent(this, NanPark.class);
        startActivity(intent);
    }
}
