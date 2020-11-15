package com.example.welcomesungshin;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.widget.ImageView;
import com.example.welcomesungshin.campus.SchoolMapActivity;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ImageView mainback;
    Calendar today = Calendar.getInstance();
    int hour = today.get(Calendar.HOUR_OF_DAY);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainback = (ImageView)findViewById(R.id.mm);
        int[] img = {R.drawable.mainfour, R.drawable.mainone, R.drawable.maintwo, R.drawable.mainthree};

        switch (hour) {
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mainback.setImageResource(img[0]);
                break;

            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                mainback.setImageResource(img[1]);
                break;

            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                mainback.setImageResource(img[2]);
                break;

            case 17:
            case 18:
            case 19:
            case 20:
                mainback.setImageResource(img[3]);
                break;

            default:
        }

    }

    public void clickedToSchool(View v) {
        Intent intent = new Intent(this, SchoolMapActivity.class);
        startActivity(intent);
    }

    public void clickedToFood(View v) {
        Intent intent = new Intent(this, FoodMapActivity.class);
        startActivity(intent);
    }

    public void clickedToNotice(View v) {
        Intent intent = new Intent(this, NoticeActivity.class);
        startActivity(intent);
    }

    public void clickedToShop(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://172.20.10.6:7080/webServer/webServer.jsp"));
        startActivity(intent);
    }

    public void clickedToEnter(View v) {
        Intent intent = new Intent(this, EntertainmentActivity.class);
        startActivity(intent);
    }

    public void clickedToCat3(View v) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("냥냥냥")
                .setMessage("안녕 웰컴~~~성신!")
                .setIcon(R.drawable.cat1)
                .setPositiveButton("안녕~", null)
                .show();
    }

    public void clickedToCat2(View v) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("냥냥냥")
                .setMessage("웰컴 성신 최고")
                .setIcon(R.drawable.cat2)
                .setPositiveButton("최고!", null)
                .show();
    }

    public void clickedToSetting(View v) {
        Intent intent = new Intent(this, Setting.class);
        startActivity(intent);
    }
}
