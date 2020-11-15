package com.example.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.welcomesungshin.R;

public class Sungshinkwan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sungshinkwan);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }

    public void clickedToSungshin01Ele(View v) {
        Intent intent = new Intent(this, Sungshin01Ele.class);
        startActivity(intent);
    }

    public void clickedToSujungkwan(View v) {
        Intent intent = new Intent(this, sujungkwan.class);
        startActivity(intent);
    }

    public void clickedToNanToSungshin(View v) {
        Intent intent = new Intent(this, NanToSungshin.class);
        startActivity(intent);
    }


}
