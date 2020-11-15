package com.example.welcomesungshin;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.util.*;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;


public class Normal extends AppCompatActivity {

    int failCount; // 틀린 횟수
    int successCount; // 성공 횟수

    Button Button_event;
    ImageView Change_image;
    ImageView result;
    ImageView State_01;

    ImageView Blank_01;
    ImageView Blank_02;
    ImageView Blank_03;
    ImageView Blank_04;
    ImageView Blank_05;
    ImageView Blank_06;

    public Normal() {
        failCount = 0;
        successCount = 0;

    }

    int r;
    String[] list = {
            "forest",
            "winter",
            "flower",
            "client",
            "volume"
    };

    public void count() {

        //틀린 횟수 == 5 이면 Fail 페이지로 이동
        if (failCount == 5) {
            moveToFail();
        }


        //성공 횟수 == N 이면 Success 페이지로 이동. (난이도 별로 성공횟수 조정)
        if (successCount == 6) {
            moveToSuccess();
        }
    }

    String newWords;
    GameLevel gameLevel = (GameLevel)GameLevel.GameLevel;
    public static Activity Normal;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_normal);
            gameLevel.finish();
            Normal = Normal.this;

        State_01 = (ImageView) findViewById(R.id.state);

        Blank_01 = (ImageView) findViewById(R.id.blank_1);
        Blank_02 = (ImageView) findViewById(R.id.blank_2);
        Blank_03 = (ImageView) findViewById(R.id.blank_3);
        Blank_04 = (ImageView) findViewById(R.id.blank_4);
        Blank_05 = (ImageView) findViewById(R.id.blank_5);
        Blank_06 = (ImageView) findViewById(R.id.blank_6);

        r = (int) (Math.random() * 5);
        newWords = list[r];
    }


    public void moveToSuccess() {
        Intent intent = new Intent(this, NormalSuccess.class);
        startActivity(intent);
    }

    public void moveToFail() {
        Intent intent = new Intent(this, NormalFail.class);
        startActivity(intent);
    }

    //알파벳 버튼 눌렀을 때 동작하는 메소드
    public void clickedToAlpha(View v) {
        switch (v.getId()) {
            case R.id.a:
                Button_event = (Button) findViewById(R.id.a);
                Change_image = (ImageView) findViewById(R.id.beforeA);
                result = (ImageView) findViewById(R.id.rA);
                //Change_image.setImageResource(R.drawable.snoopy00);
                complete('a');

                break;
            case R.id.b:
                Button_event = (Button) findViewById(R.id.b);
                Change_image = (ImageView) findViewById(R.id.beforeB);
                result = (ImageView) findViewById(R.id.rB);
                complete('b');
                break;
            case R.id.c:
                Button_event = (Button) findViewById(R.id.c);
                Change_image = (ImageView) findViewById(R.id.beforeC);
                result = (ImageView) findViewById(R.id.rC);
                complete('c');
                break;
            case R.id.d:
                Button_event = (Button) findViewById(R.id.d);
                Change_image = (ImageView) findViewById(R.id.beforeD);
                result = (ImageView) findViewById(R.id.rD);
                complete('d');
                break;
            case R.id.e:
                Button_event = (Button) findViewById(R.id.e);
                Change_image = (ImageView) findViewById(R.id.beforeE);
                result = (ImageView) findViewById(R.id.rE);
                complete('e');
                break;
            case R.id.f:
                Button_event = (Button) findViewById(R.id.f);
                Change_image = (ImageView) findViewById(R.id.beforeF);
                result = (ImageView) findViewById(R.id.rF);
                complete('f');
                break;
            case R.id.g:
                Button_event = (Button) findViewById(R.id.g);
                Change_image = (ImageView) findViewById(R.id.beforeG);
                result = (ImageView) findViewById(R.id.rG);
                complete('g');
                break;
            case R.id.h:
                Button_event = (Button) findViewById(R.id.h);
                Change_image = (ImageView) findViewById(R.id.beforeH);
                result = (ImageView) findViewById(R.id.rH);
                complete('h');
                break;
            case R.id.i:
                Button_event = (Button) findViewById(R.id.i);
                Change_image = (ImageView) findViewById(R.id.beforeI);
                result = (ImageView) findViewById(R.id.rI);
                complete('i');
                break;
            case R.id.j:
                Button_event = (Button) findViewById(R.id.j);
                Change_image = (ImageView) findViewById(R.id.beforeJ);
                result = (ImageView) findViewById(R.id.rJ);
                complete('j');
                break;
            case R.id.k:
                Button_event = (Button) findViewById(R.id.k);
                Change_image = (ImageView) findViewById(R.id.beforeK);
                result = (ImageView) findViewById(R.id.rK);
                complete('k');
                break;
            case R.id.l:
                Button_event = (Button) findViewById(R.id.l);
                Change_image = (ImageView) findViewById(R.id.beforeL);
                result = (ImageView) findViewById(R.id.rL);
                complete('l');
                break;
            case R.id.m:
                Button_event = (Button) findViewById(R.id.m);
                Change_image = (ImageView) findViewById(R.id.beforeM);
                result = (ImageView) findViewById(R.id.rM);
                complete('m');
                break;
            case R.id.n:
                Button_event = (Button) findViewById(R.id.n);
                Change_image = (ImageView) findViewById(R.id.beforeN);
                result = (ImageView) findViewById(R.id.rN);
                complete('n');
                break;
            case R.id.o:
                Button_event = (Button) findViewById(R.id.o);
                Change_image = (ImageView) findViewById(R.id.beforeO);
                result = (ImageView) findViewById(R.id.rO);
                complete('o');
                break;
            case R.id.p:
                Button_event = (Button) findViewById(R.id.p);
                Change_image = (ImageView) findViewById(R.id.beforeP);
                result = (ImageView) findViewById(R.id.rP);
                complete('p');
                break;
            case R.id.q:
                Button_event = (Button) findViewById(R.id.q);
                Change_image = (ImageView) findViewById(R.id.beforeQ);
                result = (ImageView) findViewById(R.id.rQ);
                complete('q');
                break;
            case R.id.r:
                Button_event = (Button) findViewById(R.id.r);
                Change_image = (ImageView) findViewById(R.id.beforeR);
                result = (ImageView) findViewById(R.id.rR);
                complete('r');
                break;
            case R.id.s:
                Button_event = (Button) findViewById(R.id.s);
                Change_image = (ImageView) findViewById(R.id.beforeS);
                result = (ImageView) findViewById(R.id.rS);
                complete('s');
                break;
            case R.id.t:
                Button_event = (Button) findViewById(R.id.t);
                Change_image = (ImageView) findViewById(R.id.beforeT);
                result = (ImageView) findViewById(R.id.rT);
                complete('t');
                break;
            case R.id.u:
                Button_event = (Button) findViewById(R.id.u);
                Change_image = (ImageView) findViewById(R.id.beforeU);
                result = (ImageView) findViewById(R.id.rU);
                complete('u');
                break;
            case R.id.v:
                Button_event = (Button) findViewById(R.id.v);
                Change_image = (ImageView) findViewById(R.id.beforeV);
                result = (ImageView) findViewById(R.id.rV);
                complete('v');
                break;
            case R.id.w:
                Button_event = (Button) findViewById(R.id.w);
                Change_image = (ImageView) findViewById(R.id.beforeW);
                result = (ImageView) findViewById(R.id.rW);
                complete('w');
                break;
            case R.id.x:
                Button_event = (Button) findViewById(R.id.x);
                Change_image = (ImageView) findViewById(R.id.beforeX);
                result = (ImageView) findViewById(R.id.rX);
                complete('x');
                break;
            case R.id.y:
                Button_event = (Button) findViewById(R.id.y);
                Change_image = (ImageView) findViewById(R.id.beforeY);
                result = (ImageView) findViewById(R.id.rY);
                complete('y');
                break;
            case R.id.z:
                Button_event = (Button) findViewById(R.id.z);
                Change_image = (ImageView) findViewById(R.id.beforeZ);
                result = (ImageView) findViewById(R.id.rZ);
                complete('z');
                break;
        }

        count();

    }


    void complete(char key) {
        boolean hit = false;

        for (int i = 0; i < newWords.length(); i++) {
            if (newWords.charAt(i) == key) {
                hit = true;
                result.setImageResource(R.drawable.digitalo);

                if (i == 0) {
                    switch (key) {
                        case 'a':
                            Blank_01.setImageResource(R.drawable.a);
                            break;
                        case 'b':
                            Blank_01.setImageResource(R.drawable.b);
                            break;
                        case 'c':
                            Blank_01.setImageResource(R.drawable.c);
                            break;
                        case 'd':
                            Blank_01.setImageResource(R.drawable.d);
                            break;
                        case 'e':
                            Blank_01.setImageResource(R.drawable.e);
                            break;
                        case 'f':
                            Blank_01.setImageResource(R.drawable.f);
                            break;
                        case 'g':
                            Blank_01.setImageResource(R.drawable.g);
                            break;
                        case 'h':
                            Blank_01.setImageResource(R.drawable.h);
                            break;
                        case 'i':
                            Blank_01.setImageResource(R.drawable.i);
                            break;
                        case 'j':
                            Blank_01.setImageResource(R.drawable.j);
                            break;
                        case 'k':
                            Blank_01.setImageResource(R.drawable.k);
                            break;
                        case 'l':
                            Blank_01.setImageResource(R.drawable.l);
                            break;
                        case 'm':
                            Blank_01.setImageResource(R.drawable.m);
                            break;
                        case 'n':
                            Blank_01.setImageResource(R.drawable.n);
                            break;
                        case 'o':
                            Blank_01.setImageResource(R.drawable.o);
                            break;
                        case 'p':
                            Blank_01.setImageResource(R.drawable.p);
                            break;
                        case 'q':
                            Blank_01.setImageResource(R.drawable.q);
                            break;
                        case 'r':
                            Blank_01.setImageResource(R.drawable.r);
                            break;
                        case 's':
                            Blank_01.setImageResource(R.drawable.s);
                            break;
                        case 't':
                            Blank_01.setImageResource(R.drawable.t);
                            break;
                        case 'u':
                            Blank_01.setImageResource(R.drawable.u);
                            break;
                        case 'v':
                            Blank_01.setImageResource(R.drawable.v);
                            break;
                        case 'w':
                            Blank_01.setImageResource(R.drawable.w);
                            break;
                        case 'x':
                            Blank_01.setImageResource(R.drawable.x);
                            break;
                        case 'y':
                            Blank_01.setImageResource(R.drawable.y);
                            break;
                        case 'z':
                            Blank_01.setImageResource(R.drawable.z);
                            break;
                    }
                }
                else if (i == 1) {
                    switch (key) {
                        case 'a':
                            Blank_02.setImageResource(R.drawable.a);
                            break;
                        case 'b':
                            Blank_02.setImageResource(R.drawable.b);
                            break;
                        case 'c':
                            Blank_02.setImageResource(R.drawable.c);
                            break;
                        case 'd':
                            Blank_02.setImageResource(R.drawable.d);
                            break;
                        case 'e':
                            Blank_02.setImageResource(R.drawable.e);
                            break;
                        case 'f':
                            Blank_02.setImageResource(R.drawable.f);
                            break;
                        case 'g':
                            Blank_02.setImageResource(R.drawable.g);
                            break;
                        case 'h':
                            Blank_02.setImageResource(R.drawable.h);
                            break;
                        case 'i':
                            Blank_02.setImageResource(R.drawable.i);
                            break;
                        case 'j':
                            Blank_02.setImageResource(R.drawable.j);
                            break;
                        case 'k':
                            Blank_02.setImageResource(R.drawable.k);
                            break;
                        case 'l':
                            Blank_02.setImageResource(R.drawable.l);
                            break;
                        case 'm':
                            Blank_02.setImageResource(R.drawable.m);
                            break;
                        case 'n':
                            Blank_02.setImageResource(R.drawable.n);
                            break;
                        case 'o':
                            Blank_02.setImageResource(R.drawable.o);
                            break;
                        case 'p':
                            Blank_02.setImageResource(R.drawable.p);
                            break;
                        case 'q':
                            Blank_02.setImageResource(R.drawable.q);
                            break;
                        case 'r':
                            Blank_02.setImageResource(R.drawable.r);
                            break;
                        case 's':
                            Blank_02.setImageResource(R.drawable.s);
                            break;
                        case 't':
                            Blank_02.setImageResource(R.drawable.t);
                            break;
                        case 'u':
                            Blank_02.setImageResource(R.drawable.u);
                            break;
                        case 'v':
                            Blank_02.setImageResource(R.drawable.v);
                            break;
                        case 'w':
                            Blank_02.setImageResource(R.drawable.w);
                            break;
                        case 'x':
                            Blank_02.setImageResource(R.drawable.x);
                            break;
                        case 'y':
                            Blank_02.setImageResource(R.drawable.y);
                            break;
                        case 'z':
                            Blank_02.setImageResource(R.drawable.z);
                            break;
                    }
                } else if (i == 2) {
                    switch (key) {
                        case 'a':
                            Blank_03.setImageResource(R.drawable.a);
                            break;
                        case 'b':
                            Blank_03.setImageResource(R.drawable.b);
                            break;
                        case 'c':
                            Blank_03.setImageResource(R.drawable.c);
                            break;
                        case 'd':
                            Blank_03.setImageResource(R.drawable.d);
                            break;
                        case 'e':
                            Blank_03.setImageResource(R.drawable.e);
                            break;
                        case 'f':
                            Blank_03.setImageResource(R.drawable.f);
                            break;
                        case 'g':
                            Blank_03.setImageResource(R.drawable.g);
                            break;
                        case 'h':
                            Blank_03.setImageResource(R.drawable.h);
                            break;
                        case 'i':
                            Blank_03.setImageResource(R.drawable.i);
                            break;
                        case 'j':
                            Blank_03.setImageResource(R.drawable.j);
                            break;
                        case 'k':
                            Blank_03.setImageResource(R.drawable.k);
                            break;
                        case 'l':
                            Blank_03.setImageResource(R.drawable.l);
                            break;
                        case 'm':
                            Blank_03.setImageResource(R.drawable.m);
                            break;
                        case 'n':
                            Blank_03.setImageResource(R.drawable.n);
                            break;
                        case 'o':
                            Blank_03.setImageResource(R.drawable.o);
                            break;
                        case 'p':
                            Blank_03.setImageResource(R.drawable.p);
                            break;
                        case 'q':
                            Blank_03.setImageResource(R.drawable.q);
                            break;
                        case 'r':
                            Blank_03.setImageResource(R.drawable.r);
                            break;
                        case 's':
                            Blank_03.setImageResource(R.drawable.s);
                            break;
                        case 't':
                            Blank_03.setImageResource(R.drawable.t);
                            break;
                        case 'u':
                            Blank_03.setImageResource(R.drawable.u);
                            break;
                        case 'v':
                            Blank_03.setImageResource(R.drawable.v);
                            break;
                        case 'w':
                            Blank_03.setImageResource(R.drawable.w);
                            break;
                        case 'x':
                            Blank_03.setImageResource(R.drawable.x);
                            break;
                        case 'y':
                            Blank_03.setImageResource(R.drawable.y);
                            break;
                        case 'z':
                            Blank_03.setImageResource(R.drawable.z);
                            break;
                    }
                } else if (i == 3) {
                    switch (key) {
                        case 'a':
                            Blank_04.setImageResource(R.drawable.a);
                            break;
                        case 'b':
                            Blank_04.setImageResource(R.drawable.b);
                            break;
                        case 'c':
                            Blank_04.setImageResource(R.drawable.c);
                            break;
                        case 'd':
                            Blank_04.setImageResource(R.drawable.d);
                            break;
                        case 'e':
                            Blank_04.setImageResource(R.drawable.e);
                            break;
                        case 'f':
                            Blank_04.setImageResource(R.drawable.f);
                            break;
                        case 'g':
                            Blank_04.setImageResource(R.drawable.g);
                            break;
                        case 'h':
                            Blank_04.setImageResource(R.drawable.h);
                            break;
                        case 'i':
                            Blank_04.setImageResource(R.drawable.i);
                            break;
                        case 'j':
                            Blank_04.setImageResource(R.drawable.j);
                            break;
                        case 'k':
                            Blank_04.setImageResource(R.drawable.k);
                            break;
                        case 'l':
                            Blank_04.setImageResource(R.drawable.l);
                            break;
                        case 'm':
                            Blank_04.setImageResource(R.drawable.m);
                            break;
                        case 'n':
                            Blank_04.setImageResource(R.drawable.n);
                            break;
                        case 'o':
                            Blank_04.setImageResource(R.drawable.o);
                            break;
                        case 'p':
                            Blank_04.setImageResource(R.drawable.p);
                            break;
                        case 'q':
                            Blank_04.setImageResource(R.drawable.q);
                            break;
                        case 'r':
                            Blank_04.setImageResource(R.drawable.r);
                            break;
                        case 's':
                            Blank_04.setImageResource(R.drawable.s);
                            break;
                        case 't':
                            Blank_04.setImageResource(R.drawable.t);
                            break;
                        case 'u':
                            Blank_04.setImageResource(R.drawable.u);
                            break;
                        case 'v':
                            Blank_04.setImageResource(R.drawable.v);
                            break;
                        case 'w':
                            Blank_04.setImageResource(R.drawable.w);
                            break;
                        case 'x':
                            Blank_04.setImageResource(R.drawable.x);
                            break;
                        case 'y':
                            Blank_04.setImageResource(R.drawable.y);
                            break;
                        case 'z':
                            Blank_04.setImageResource(R.drawable.z);
                            break;
                    }
                } else if (i == 4) {
                    switch (key) {
                        case 'a':
                            Blank_05.setImageResource(R.drawable.a);
                            break;
                        case 'b':
                            Blank_05.setImageResource(R.drawable.b);
                            break;
                        case 'c':
                            Blank_05.setImageResource(R.drawable.c);
                            break;
                        case 'd':
                            Blank_05.setImageResource(R.drawable.d);
                            break;
                        case 'e':
                            Blank_05.setImageResource(R.drawable.e);
                            break;
                        case 'f':
                            Blank_05.setImageResource(R.drawable.f);
                            break;
                        case 'g':
                            Blank_05.setImageResource(R.drawable.g);
                            break;
                        case 'h':
                            Blank_05.setImageResource(R.drawable.h);
                            break;
                        case 'i':
                            Blank_05.setImageResource(R.drawable.i);
                            break;
                        case 'j':
                            Blank_05.setImageResource(R.drawable.j);
                            break;
                        case 'k':
                            Blank_05.setImageResource(R.drawable.k);
                            break;
                        case 'l':
                            Blank_05.setImageResource(R.drawable.l);
                            break;
                        case 'm':
                            Blank_05.setImageResource(R.drawable.m);
                            break;
                        case 'n':
                            Blank_05.setImageResource(R.drawable.n);
                            break;
                        case 'o':
                            Blank_05.setImageResource(R.drawable.o);
                            break;
                        case 'p':
                            Blank_05.setImageResource(R.drawable.p);
                            break;
                        case 'q':
                            Blank_05.setImageResource(R.drawable.q);
                            break;
                        case 'r':
                            Blank_05.setImageResource(R.drawable.r);
                            break;
                        case 's':
                            Blank_05.setImageResource(R.drawable.s);
                            break;
                        case 't':
                            Blank_05.setImageResource(R.drawable.t);
                            break;
                        case 'u':
                            Blank_05.setImageResource(R.drawable.u);
                            break;
                        case 'v':
                            Blank_05.setImageResource(R.drawable.v);
                            break;
                        case 'w':
                            Blank_05.setImageResource(R.drawable.w);
                            break;
                        case 'x':
                            Blank_05.setImageResource(R.drawable.x);
                            break;
                        case 'y':
                            Blank_05.setImageResource(R.drawable.y);
                            break;
                        case 'z':
                            Blank_05.setImageResource(R.drawable.z);
                            break;
                    }
                } else if (i == 5) {
                    switch (key) {
                        case 'a':
                            Blank_06.setImageResource(R.drawable.a);
                            break;
                        case 'b':
                            Blank_06.setImageResource(R.drawable.b);
                            break;
                        case 'c':
                            Blank_06.setImageResource(R.drawable.c);
                            break;
                        case 'd':
                            Blank_06.setImageResource(R.drawable.d);
                            break;
                        case 'e':
                            Blank_06.setImageResource(R.drawable.e);
                            break;
                        case 'f':
                            Blank_06.setImageResource(R.drawable.f);
                            break;
                        case 'g':
                            Blank_06.setImageResource(R.drawable.g);
                            break;
                        case 'h':
                            Blank_06.setImageResource(R.drawable.h);
                            break;
                        case 'i':
                            Blank_06.setImageResource(R.drawable.i);
                            break;
                        case 'j':
                            Blank_06.setImageResource(R.drawable.j);
                            break;
                        case 'k':
                            Blank_06.setImageResource(R.drawable.k);
                            break;
                        case 'l':
                            Blank_06.setImageResource(R.drawable.l);
                            break;
                        case 'm':
                            Blank_06.setImageResource(R.drawable.m);
                            break;
                        case 'n':
                            Blank_06.setImageResource(R.drawable.n);
                            break;
                        case 'o':
                            Blank_06.setImageResource(R.drawable.o);
                            break;
                        case 'p':
                            Blank_06.setImageResource(R.drawable.p);
                            break;
                        case 'q':
                            Blank_06.setImageResource(R.drawable.q);
                            break;
                        case 'r':
                            Blank_06.setImageResource(R.drawable.r);
                            break;
                        case 's':
                            Blank_06.setImageResource(R.drawable.s);
                            break;
                        case 't':
                            Blank_06.setImageResource(R.drawable.t);
                            break;
                        case 'u':
                            Blank_06.setImageResource(R.drawable.u);
                            break;
                        case 'v':
                            Blank_06.setImageResource(R.drawable.v);
                            break;
                        case 'w':
                            Blank_06.setImageResource(R.drawable.w);
                            break;
                        case 'x':
                            Blank_06.setImageResource(R.drawable.x);
                            break;
                        case 'y':
                            Blank_06.setImageResource(R.drawable.y);
                            break;
                        case 'z':
                            Blank_06.setImageResource(R.drawable.z);
                            break;
                    }
                }
                successCount++;
            }
        }
        if (!hit) {
            failCount++;
            if (failCount == 1) {
                State_01.setImageResource(R.drawable.second);

            } else if (failCount == 2) {
                State_01.setImageResource(R.drawable.third);

            } else if (failCount == 3) {
                State_01.setImageResource(R.drawable.forth);

            } else if (failCount == 4) {
                State_01.setImageResource(R.drawable.fifth);

            } else if (failCount == 5) {
                State_01.setImageResource(R.drawable.last);

            }

            result.setImageResource(R.drawable.digitalx);


        }
    }
}

