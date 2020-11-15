package com.example.welcomesungshin;


import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.app.Activity;

import android.support.v7.app.AppCompatActivity;

public class GameLevel extends AppCompatActivity {


    public static Activity GameLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_level);
        GameLevel = GameLevel.this;
    }

    public void clickedToEasy(View v){
        Intent intent = new Intent(this, Easy.class);
        startActivity(intent);
    }

    public void clickedToNormal(View v){
        Intent intent = new Intent(this, Normal.class);
        startActivity(intent);
    }

    public void clickedToHard(View v){
        Intent intent = new Intent(this, Hard.class);
        startActivity(intent);
    }
}