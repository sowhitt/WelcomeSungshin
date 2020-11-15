package com.example.welcomesungshin;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class HangmanExplain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangman_explain);
    }

    public void clickedToHangman(View v){
        Intent intent = new Intent(this, HangMainActivity.class);
        startActivity(intent);
    }

    public void clickedToHangmanLevel(View v) {
        Intent intent = new Intent(this, GameLevel.class);
        startActivity(intent);
    }

    }