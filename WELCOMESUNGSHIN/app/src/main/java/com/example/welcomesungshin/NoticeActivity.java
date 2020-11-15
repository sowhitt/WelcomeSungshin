package com.example.welcomesungshin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

    public class NoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        String[] list = {
                "< 학 사 공 지 >",
                "[성적] 2019-1 성적조회 안내(여름계절수업 포함)",
                "[졸업가이드] 재학생 졸업필수요건 안내",
                "[2019-2] 재입학 선발 안내",
                "[선발] 2020학년도 1학기 교환·방문학생 선발 안내",
                "< 일 반 공 지 >",
                "[박물관] 운정그린캠퍼스 박물관 휴관안내",
                "[2019-2] 성신글로벌프렌즈(버디) 추가 모집",
                "[박물관] 나만의 야생화 기록하기!",
                "[현장실습운영팀] 2019-2학기(9월~12월) 현장실습(산학) 연수생 모집 설명회 개최",
                "[2019] 여름방학 교내 정보화(자격증) 특강 안내",
        };


        ArrayAdapter<String> adapter;

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list);

        ListView listView = (ListView) findViewById(R.id.ListView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                int pposition = position;
                switch (pposition) {
                    case 0:
                        break;
                    case 1:
                        Intent aIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://acm.sungshin.ac.kr/proweb/board_det.jsp?notiNo=1b490164d27d5809000d004087c5442e"));
                        startActivity(aIntent);
                        break;
                    case 2:
                        Intent bIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://acm.sungshin.ac.kr/proweb/board_det.jsp?notiNo=92d36a4cd27d580901ee19d85d9af143"));
                        startActivity(bIntent);
                        break;
                    case 3:
                        Intent cIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://acm.sungshin.ac.kr/proweb/board_det.jsp?notiNo=693271f4d27d58090076bddd601341bb"));
                        startActivity(cIntent);
                        break;
                    case 4:
                        Intent dIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sungshin.ac.kr:8900/servlet/kr.co.k2web.jwizard.contents.board.boardUser.servlet.userMainServlet?client_id=bbs&handle=55&command=view&curPage=1&board_seq=1703&sBoard_id=1&b_type=01"));
                        startActivity(dIntent);
                        break;
                    case 5:
                        break;
                    case 6:
                        Intent eIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sungshin.ac.kr:8900/servlet/kr.co.k2web.jwizard.contents.board.boardUser.servlet.userMainServlet?client_id=bbs&handle=55&command=view&curPage=1&board_seq=1702&sBoard_id=1&b_type=01"));
                        startActivity(eIntent);
                        break;
                    case 7:
                        Intent fIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sungshin.ac.kr:8900/servlet/kr.co.k2web.jwizard.contents.board.boardUser.servlet.userMainServlet?handle=55&board_id=55&client_id=bbs&site_id=bbs&curPage=1&search=&column=&catecolumn=&catesearch=&b_type=01&list_type=01&board_seq=1701&command=view&chkBoxSeq=&chkBoxId=&chkBoxPos=&chkBoxDepth=&chkBoxFam_Seq=&warning_yn=N&category_id=0&category_depth="));
                        startActivity(fIntent);
                        break;
                    case 8:
                        Intent gIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sungshin.ac.kr:8900/servlet/kr.co.k2web.jwizard.contents.board.boardUser.servlet.userMainServlet?handle=55&board_id=55&client_id=bbs&site_id=bbs&curPage=1&search=&column=&catecolumn=&catesearch=&b_type=01&list_type=01&board_seq=1698&command=view&chkBoxSeq=&chkBoxId=&chkBoxPos=&chkBoxDepth=&chkBoxFam_Seq=&warning_yn=N&category_id=0&category_depth=\n"));
                        startActivity(gIntent);
                        break;
                    case 9:
                        Intent hIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sungshin.ac.kr:8900/servlet/kr.co.k2web.jwizard.contents.board.boardUser.servlet.userMainServlet?handle=55&board_id=55&client_id=bbs&site_id=bbs&curPage=1&search=&column=&catecolumn=&catesearch=&b_type=01&list_type=01&board_seq=1697&command=view&chkBoxSeq=&chkBoxId=&chkBoxPos=&chkBoxDepth=&chkBoxFam_Seq=&warning_yn=N&category_id=0&category_depth=\n"));
                        startActivity(hIntent);
                        break;
                    case 10:
                        finish();
                }
            }
        });
    }
}