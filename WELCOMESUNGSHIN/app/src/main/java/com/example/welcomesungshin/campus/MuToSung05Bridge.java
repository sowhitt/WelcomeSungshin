package com.example.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.welcomesungshin.R;
import com.example.welcomesungshin.campus.CloudBridgeFront;
import com.example.welcomesungshin.campus.Emakkwan;
import com.example.welcomesungshin.campus.SchoolMapActivity;
import com.example.welcomesungshin.campus.Sungshin05Ele;

public class MuToSung05Bridge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mu_to_sung05_bridge);
        getWindow().setWindowAnimations(0);
    }
    public void clickedToSchoolMap(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }

    public void clickedToMusic(View v) {
        Intent intent = new Intent(this, Emakkwan.class);
        startActivity(intent);
    }

    public void clickedToSung05(View v) {
        Intent intent = new Intent(this, Sungshin05Ele.class);
        startActivity(intent);
    }
}
