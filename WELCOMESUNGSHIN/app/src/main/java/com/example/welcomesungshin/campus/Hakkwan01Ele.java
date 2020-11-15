package com.example.welcomesungshin.campus;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.welcomesungshin.R;

public class Hakkwan01Ele extends AppCompatActivity {

    public static Activity Hakkwan01Ele;

    Hakkwan hakkwan = (Hakkwan)Hakkwan.Hakkwan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        hakkwan.finish();
        Hakkwan01Ele = Hakkwan01Ele.this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkwan01_ele);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }

    public void clickedToHakkwan02Cafe(View v) {
        Intent intent = new Intent(this, Hakkwan02Cafe.class);
        startActivity(intent);
    }
    public void clickedToHakkwan(View v) {
        Intent intent = new Intent(this, Hakkwan.class);
        startActivity(intent);
    }

}
