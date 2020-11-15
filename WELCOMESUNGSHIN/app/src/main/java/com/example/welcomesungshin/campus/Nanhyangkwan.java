package com.example.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.welcomesungshin.R;

public class Nanhyangkwan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nanhyangkwan);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }

    public void clickedToNan01Ele(View v) {
        Intent intent = new Intent(this, Nan01Ele.class);
        startActivity(intent);
    }

    public void clickedToHakkwan04Cafe(View v) {
        Intent intent = new Intent(this, Hakkwan04Cafe.class);
        startActivity(intent);
    }
}
