package com.example.welcomesungshin;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NormalSuccess extends AppCompatActivity {

    private static MediaPlayer mp;
    Normal normal = (Normal)Normal.Normal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_success);

        normal.finish();

        mp = MediaPlayer.create(this, R.raw.successb);
        mp.start();
    }

    public void clickedToHangman(View v){
        Intent intent = new Intent(this, GameLevel.class);
        startActivity(intent);
        mp.stop();
    }
}
