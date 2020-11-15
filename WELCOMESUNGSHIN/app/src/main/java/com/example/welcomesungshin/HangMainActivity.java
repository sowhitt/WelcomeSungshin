package com.example.welcomesungshin;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class HangMainActivity extends AppCompatActivity {

    public static MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangmain);


        mp = MediaPlayer.create(this, R.raw.hangmanbgm);
        mp.setLooping(true);
        mp.start();
    }


    public void clickedToHangman(View v){
        Intent intent = new Intent(this, GameLevel.class);
        startActivity(intent);
    }

    public void clickedToHangmanExplain(View v){
        Intent intent = new Intent(this, HangmanExplain.class);
        startActivity(intent);
    }

    public void clickedToEnter(View v){
        mp.stop();
        Intent intent = new Intent(this, EntertainmentActivity.class);
        startActivity(intent);
        finish();
    }

    public void onBackPressed() {
        mp.stop();
        finish();
    }
}