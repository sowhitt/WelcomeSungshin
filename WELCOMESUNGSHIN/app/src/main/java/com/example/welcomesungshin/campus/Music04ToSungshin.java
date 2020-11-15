package com.example.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.welcomesungshin.R;

public class Music04ToSungshin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music04_to_sungshin);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }

    public void clickedToSungshin08Ele(View v) {
        Intent intent = new Intent(this, Sungshin08Ele.class);
        startActivity(intent);
    }

    public void clickedToMusic04Ele (View v) {
        Intent intent = new Intent(this, Music04Ele.class);
        startActivity(intent);
    }
}
