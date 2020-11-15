package com.example.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.welcomesungshin.R;

public class Music04Ele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music04_ele);
        getWindow().setWindowAnimations(0);
    }
    public void clickedToSchoolMap(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }

    public void clickedToMusic04ToSungshin(View v) {
        Intent intent = new Intent(this, Music04ToSungshin.class);
        startActivity(intent);
    }

    public void clickedToEmakkwan (View v) {
        Intent intent = new Intent(this, Emakkwan.class);
        startActivity(intent);
    }
}
