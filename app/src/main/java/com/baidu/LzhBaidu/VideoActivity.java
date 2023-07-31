package com.baidu.LzhBaidu;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.baidu.LzhBaidu.R;

import java.util.ArrayList;
import java.util.List;

public class VideoActivity extends Activity {
    private Button main_home_btn;
    private Button main_vedio_btn;
    private  Button main_person_btn;

    private List<video_item> video_List;

    private VideoAdapter videoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        RecyclerView recyclerView = findViewById(R.id.v_rc);

        main_home_btn=findViewById(R.id.home_button);
        main_vedio_btn=findViewById(R.id.vedio_button);
        main_person_btn=findViewById(R.id.homepage_button);

        video_List = new ArrayList<>();

        video_item temp1 = new video_item("https://box.nju.edu.cn/f/fa59340426d849f4adb6/?dl=1","https://box.nju.edu.cn/f/c59c0c6e388747189520/?dl=1"
                ,"以国之名 永续传承","微视频");

        video_item temp2 = new video_item("https://box.nju.edu.cn/f/fa59340426d849f4adb6/?dl=1","https://box.nju.edu.cn/f/d5623fda75a7458cbb90/?dl=1"
                ,"这个人体最大的营养中心，小心它变身“沉默杀手”","小央科普");

        video_item temp3 = new video_item("https://box.nju.edu.cn/f/fa59340426d849f4adb6/?dl=1","https://box.nju.edu.cn/f/769157cd69074eea8ea0/?dl=1"
                ,"年 轻 人 生 活 现 状（一）","小央剧场");

        video_item temp4 = new video_item("https://box.nju.edu.cn/f/fa59340426d849f4adb6/?dl=1","https://box.nju.edu.cn/f/5ba71b1e0346463c9ad8/?dl=1"
                ,"夜游滕王阁，嗨吃夜市，畅玩洪都夜巷","2023恰噶南昌消费季");

        video_List.add(temp1);
        video_List.add(temp2);
        video_List.add(temp3);
        video_List.add(temp4);
        video_List.add(temp1);
        video_List.add(temp2);
        video_List.add(temp3);
        video_List.add(temp4);

        videoAdapter = new VideoAdapter(video_List);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(videoAdapter);


        main_home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                intent=new Intent(VideoActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        main_person_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                intent=new Intent(VideoActivity.this,HomepageActivity.class);
                startActivity(intent);
            }
        });

        main_vedio_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                intent=new Intent(VideoActivity.this, VideoActivity.class);
                startActivity(intent);
            }
        });

    }
}