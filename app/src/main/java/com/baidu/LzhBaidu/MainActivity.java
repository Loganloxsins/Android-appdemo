package com.baidu.LzhBaidu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.baidu.LzhBaidu.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private Button btn_wt;
    private RecyclerView news;
    private Button home_button;
    private Button video_button;
    private Button homepage_button;



    private List<News_item> newsList;

    private NewsAdapter newsAdapter;


    private Button mSearchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_wt = findViewById(R.id.weather_button);
        news = findViewById(R.id.news);

        home_button = findViewById(R.id.home_button);
        video_button = findViewById(R.id.vedio_button);
        homepage_button = findViewById(R.id.homepage_button);

        mSearchView = findViewById(R.id.searchButton);


        newsList = new ArrayList<>();
        News_item temp1 = new News_item("习近平回信勉励“模范空降兵连”全体官兵", "习近平回信勉励“模范空降兵连”全体官兵 弘扬光荣传统 苦练过硬本领 努力锻造敢打必胜的空降利刃"
                    , "https://box.nju.edu.cn/f/b0620c1902464707a8ac/?dl=1","http://www.news.cn/politics/leaders/2023-07/31/c_1129778221.htm");


        News_item temp2 = new News_item("专家：不是所有人都能选择暂缓就业", "国家统计局近期发布数据显示，6月份，青年失业率为21.3%，连续第三个月创下新高。"
                , "https://box.nju.edu.cn/f/a009d5152dc84ff5a100/?dl=1","https://baijiahao.baidu.com/s?id=1772901873822719024&wfr=spider&for=pc");

        News_item temp3 = new News_item("促进民营经济做大做优做强", "我国民营经济只能壮大、不能弱化。把民营企业和民营企业家当作自己人，我们一定能促进民营经济做大做优做强，更好推动经济社会高质量发展。"
                , "https://box.nju.edu.cn/f/8d93c1a645294b49871b/?dl=1","https://baijiahao.baidu.com/s?id=1772887528094117839");

        News_item temp4 = new News_item("北京暴雨已致2死 居民目睹有人昏迷", "31日，北京门头沟区连续遭遇强降雨，目前已有两人遇难。据中门寺南路段目击者称，有人员在路上昏迷，众多路人自发... "
                , "https://box.nju.edu.cn/f/877d0c658db64f578d87/?dl=1","https://www.chinaxiaokang.com/chengshi/2023/0731/1447217.html");


        newsList.add(temp1);
        newsList.add(temp2);
        newsList.add(temp3);
        newsList.add(temp4);
        newsList.add(temp1);
        newsList.add(temp2);
        newsList.add(temp3);
        newsList.add(temp4);
        newsList.add(temp1);
        newsList.add(temp2);
        newsList.add(temp3);
        newsList.add(temp4);


        newsAdapter = new NewsAdapter(newsList);
        news.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        news.setAdapter(newsAdapter);




        btn_wt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(MainActivity.this, WeatherPageActivity.class);
                startActivity(intent);
            }
        });

        mSearchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });




        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        homepage_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(MainActivity.this, HomepageActivity.class);
                startActivity(intent);
            }
        });

        video_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(MainActivity.this, VideoActivity.class);
                startActivity(intent);
            }
        });
//三个主键的点击事件

    }
}
