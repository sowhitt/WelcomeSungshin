package com.example.welcomesungshin;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Success extends AppCompatActivity {

    private static MediaPlayer mp;
    Easy easy = (Easy)Easy.Easy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        easy.finish();

        mp = MediaPlayer.create(this, R.raw.successb);
        mp.start();
    }

    public void clickedToHangman(View v){
        Intent intent = new Intent(this, GameLevel.class);
        startActivity(intent);
        mp.stop();
    }

    public void clickedToMain(View v){
        Intent intent = new Intent(this, HangMainActivity.class);
        startActivity(intent);
        mp.stop();
    }
}