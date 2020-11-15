package com.example.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.welcomesungshin.R;

public class NanStuRes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nan_stu_res);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }


    public void clickedToNan03Ele(View v) {
        Intent intent = new Intent(this, Nan03Ele.class);
        startActivity(intent);
    }
}