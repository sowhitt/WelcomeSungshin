package com.example.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.welcomesungshin.R;

public class Sujung10StuRes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sujung10_stu_res);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }

    public void clickedToSujung10StuRes(View v) {
        Intent intent = new Intent(this, Sujung10StuRes.class);
        startActivity(intent);
    }


    public void clickedToSujung10Ele_C(View v) {
        Intent intent = new Intent(this, Sujung10Ele_C.class);
        startActivity(intent);
    }
}
