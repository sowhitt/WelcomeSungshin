package com.example.welcomesungshin;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class EntertainmentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);
    }

    public void clickedToMain(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void clickedToHangmanActivity(View v) {
        Intent intent = new Intent(this,HangMainActivity.class);
        startActivity(intent);
    }

    public void clickedToNumberBaseball(View v) {
        Intent intent = new Intent(this,Baseball.class);
        startActivity(intent);
    }

    public void clickedToFortuneCookie(View v) {
        Intent intent = new Intent(this,FortuneCookie.class);
        startActivity(intent);
    }
}
