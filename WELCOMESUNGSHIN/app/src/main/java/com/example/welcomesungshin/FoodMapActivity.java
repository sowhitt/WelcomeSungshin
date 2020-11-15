package com.example.welcomesungshin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.welcomesungshin.ExpandableListAdapter;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;


public class FoodMapActivity extends AppCompatActivity {

    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_map);

        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        List<ExpandableListAdapter.Item> data = new ArrayList<>();

        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "한식"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "정키친"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "아리랑"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "요리잔치"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "조부장 성신김밥"));

        ExpandableListAdapter.Item western = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "양식");
        western.invisibleChildren = new ArrayList<>();
        western.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "미오지오"));
        western.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "쓰리로보스"));
        western.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "홀슈"));
        western.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "레지아노"));
        western.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "버거 바이블"));
        data.add(western);

        ExpandableListAdapter.Item chinese = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "중식");
        chinese.invisibleChildren = new ArrayList<>();
        chinese.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "애정 마라샹궈"));
        data.add(chinese);

        ExpandableListAdapter.Item etc = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "기타");
        etc.invisibleChildren = new ArrayList<>();
        etc.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "투고 샐러드"));
        etc.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "안녕 베트남"));
        data.add(etc);

        ExpandableListAdapter.Item japanese = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "일식");
        japanese.invisibleChildren = new ArrayList<>();
        japanese.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "인도이웃"));
        japanese.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "윤휘식당"));
        data.add(japanese);

        ExpandableListAdapter.Item dissert = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "카페, 디저트");
        dissert.invisibleChildren = new ArrayList<>();
        dissert.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "그릭데이"));
        dissert.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "본크레페"));
        dissert.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "맨케이브"));
        dissert.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "모던 바이츠"));
        dissert.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "슬로우 브래드 파파"));
        dissert.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "메종 드루즈"));
        data.add(dissert);

        recyclerview.setAdapter(new ExpandableListAdapter(data));
    }

    public void clickedToGmap(View v) {
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    public void onBackButtonClicked(View v){
        finish();
    }

    public void clickedToReco(View v) {
        Intent intent = new Intent(this,Recommend.class);
        startActivity(intent);
    }

}