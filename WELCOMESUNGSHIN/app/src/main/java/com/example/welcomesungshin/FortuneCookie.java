package com.example.welcomesungshin;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class FortuneCookie<msg> extends AppCompatActivity {

    ImageView mImgView;

    public static MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortune_cookie);

        mp = MediaPlayer.create(this, R.raw.fortune);
        mp.setLooping(true);
        mp.start();

        mImgView = (ImageView) findViewById(R.id.imgTranslate);
        final Animation animTransTwits = AnimationUtils
                .loadAnimation(this, R.anim.rotate);

        Button btnCycle = (Button) findViewById(R.id.btn_twit);

        btnCycle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int n = (int) ((Math.random() * 10) + 1) - 1;
                String msg[] = new String[10];
                msg[0] = "힘들었던 일들이 풀리고 행복해질 것입니다";
                msg[1] = "오늘 누군가가 도움을 줄 것입니다";
                msg[2] = "다음 생은 없어요 그러니 하고 싶은 것을 하세요";
                msg[3] = "손해 본 줄 알았던 곳에서 좋은 소식을 들을 수 있습니다";
                msg[4] = "흥미진진한 기회가 찾아오면 받아들이세요";
                msg[5] = "당신이 만든 행복이 주위를 감쌀 것입니다";
                msg[6] = "어제보다 좋은 하루가 될 것입니다";
                msg[7] = "시작이 반입니다 지금 시작하세요";
                msg[8] = "주변의 소리에 귀 기울여 보세요";
                msg[9] = "행운을 믿는 사람에게 손을 건네줍니다";



                new AlertDialog.Builder(FortuneCookie.this)
                            .setTitle("당신의 포춘쿠키")
                            .setMessage(msg[n])
                            .setIcon(R.drawable.capsule)
                            .setPositiveButton("X", null)
                            .show();

            }
        });
        mImgView.startAnimation(animTransTwits);
    }

    public void clickedToEnter(View v) {
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


