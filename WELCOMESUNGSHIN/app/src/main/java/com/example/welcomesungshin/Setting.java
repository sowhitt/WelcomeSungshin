package com.example.welcomesungshin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void buttonHelp(View v) {
        Intent intent = new Intent(this, Explain.class);
        startActivity(intent);
    }

    public void buttonProgrammer(View v) {
        Intent intent = new Intent(this, Programmer.class);
        startActivity(intent);
    }

    public void buttonQuestion(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://172.20.10.6:7080/webServer/question.jsp"));
        startActivity(intent);
    }

    public void clickedToBack(View v) {
        finish();
    }
}
