package com.example.welcomesungshin;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Baseball extends AppCompatActivity {

    public static MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseball);

        mp = MediaPlayer.create(this, R.raw.baseball);
        mp.setLooping(true);
        mp.start();
    }

    public void buttonClick1(View v){
        Intent intent = new Intent(getApplicationContext(),GameActivity.class);
        startActivityForResult(intent,1002);
    }

    public void buttonClick2(View v){
        Intent intent = new Intent(getApplicationContext(),HelpActivity.class);
        startActivityForResult(intent,1002);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        mp.stop();
        finish();
    }

    public void clickedToEnter(View v) {
        mp.stop();
        Intent intent = new Intent(this, EntertainmentActivity.class);
        startActivity(intent);
    }
}