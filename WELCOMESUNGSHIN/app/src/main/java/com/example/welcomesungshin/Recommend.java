package com.example.welcomesungshin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Recommend extends AppCompatActivity {

    ImageView back;
    TextView res;
    TextView sul;

    int[] img = {R.drawable.alilang1, R.drawable.burger1, R.drawable.crepe1, R.drawable.greek1, R.drawable.india1,
            R.drawable.kimbab1, R.drawable.mencave1, R.drawable.mara1, R.drawable.mejong1, R.drawable.miozio1,
            R.drawable.modernbites1, R.drawable.papa1, R.drawable.resiano1, R.drawable.salad1, R.drawable.seoseo1,
            R.drawable.threelobos1, R.drawable.yoons1};

    String name[] = {"아리랑", "버거 바이블", "본 크레페", "그릭데이", "인도 이웃", "성신 김밥",
            "맨케이브", "애정 마라샹궈", "메종 드루즈", "미오지오", "모던 바이츠",
            "슬로우 브레드 파파", "레지아노", "투고 샐러드", "안녕 베트남", "쓰리 로보스", "윤휘식당"
    };

    String menu[] = {"평일 08:00 - 20:00   토요일 10:00 - 20:00\n"+"참치 3,500 \n연어 3,900",
            "평일 11:30 - 22:00 \n브레이크타임 16:00-17:30\n주말 12:00 - 22:00:30 \n" + "바이블버거 9,500   아스파라거스버거 13,000",
            "평일 14:00 - 재료 소진 시\n" +"누텔라 바나나 크레페 3,500\n로투스 딸기 크레페 3,500",
            "평일 11:00 - 20:00\n토요일 12:00 - 20:00 \n일요일 휴무\n" +"코발트 4200\n트리플 B 3700",
            "매일 재료소진시까지\n"+"버섯카레 6,000\n로스카츠카레 7,500",
            "평일 8:30~ 12:00\n" +"치킨치즈 2,800\n매운오뎅 2,800",
            "평일 08:00 - 20:00   토요일 10:00 - 20:00 \n일요일 휴무\n" +"바닐라라떼 3,700\n그린티라떼 3,700",
            "평일 12:00 - 23:00 \n주말 11:30 - 23:00\n" +"마라탕 100g당 2900~\n꿔바로우 16,000",
            "매일 10:30 - 20:00\n일요일 휴무\n" +"얼그레이 2,000\n아몬드 2,000",
            "매일 11:00 - 22:00 \n브레이크타임 15:30~17:00\n" + "빠네 크림 파스타 10,500원\n새우 링귀네 파스타 8,500원",
            "매일 11:00 - 20:00\n" + "당일제품 소진 시 조기 종료\n" + "앙버터 3000\n얼그레이스콘 3000",
            "매일 07:00 - 23:00\n" +"앙버터 3,800\n바질치즈브레드 2,900",
            "매일 11:00 - 21:30\n" +"알리오올리오 7,000 \n새우로제 9,000",
            "평일 11:00 - 21:00\n브레이크타임 15:30 - 16:30\n주말 11:00 - 21:00\n" +"닭다리살스테이크샐러드 6,900\n목살스테이크샐러드 6,500",
            "매주 월요일 휴무 매일 11:30~22:00 \n" + "브레이크타임 15:00~17:00  \n주말, 공휴일 16:00~17:00\n" +"쌀국수 9,000        분짜 11,000",
            "매일 17:00 - 02:00\n연중무휴\n" +"과일야채샐러드 15,000\n로스트치킨과 샐러드 23,000",
            "매일 11:30 - 21:30\n" +"재료준비시간 15:30 - 17:30\n" +"함박스테이크 11,000\n치킨난반 10,000"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);

        back = (ImageView)findViewById(R.id.layout);
        res = (TextView)findViewById(R.id.eat);
        sul = (TextView)findViewById(R.id.menu);

        Random ram = new Random();
        int num = ram.nextInt(img.length);
        back.setImageResource(img[num]);
        res.setText(name[num]);

        sul.setText(menu[num]);
    }

    public void clickedToFood(View v) {
        finish();
    }
}
