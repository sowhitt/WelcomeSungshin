package com.example.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

import com.example.welcomesungshin.MainActivity;
import com.example.welcomesungshin.R;
import com.example.welcomesungshin.campus.Sungshinkwan;
import com.example.welcomesungshin.campus.sujungkwan;

public class SchoolMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_map);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void clickedToSungshinkwan(View v) {
        Intent intent = new Intent(this, Sungshinkwan.class);
        startActivity(intent);
    }

    public void clickedToSujungkwan(View v) {
        Intent intent = new Intent(this, sujungkwan.class);
        startActivity(intent);
    }

    public void clickedToHakkwan(View v) {
        Intent intent = new Intent(this,Hakkwan.class);
        startActivity(intent);
    }

    public void clickedToJohyungkwan(View v) {
        Intent intent = new Intent(this,Johyungkwan.class);
        startActivity(intent);
    }

    public void clickedToNanhyangkwan(View v) {
        Intent intent = new Intent(this,Nanhyangkwan.class);
        startActivity(intent);
    }

    public void clickedToEmakkwan(View v) {
        Intent intent = new Intent(this,Emakkwan.class);
        startActivity(intent);
    }

    public void clickedToShortcut(View v) {
        Intent intent = new Intent(this, Shortcut.class);
        startActivity(intent);
    }

}
