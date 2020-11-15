package com.example.welcomesungshin;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HardSuccess extends AppCompatActivity {

    private static MediaPlayer mp;
    Hard hard = (Hard)Hard.Hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_success);
        hard.finish();
        mp = MediaPlayer.create(this, R.raw.successb);
        mp.start();
    }

    public void clickedToHangman(View v){
        Intent intent = new Intent(this, GameLevel.class);
        startActivity(intent);
        mp.stop();
    }
}
