package com.baidu.LzhBaidu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class HomepageActivity extends Activity {
    private Button home_button;
    private Button video_button;
    private  Button homepage_button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_homepage);



        home_button =findViewById(R.id.home_button);
        video_button =findViewById(R.id.video_button);
        homepage_button =findViewById(R.id.homepage_button);



        //三个主键的点击事件
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                intent=new Intent(HomepageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        homepage_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                intent=new Intent(HomepageActivity.this,HomepageActivity.class);
                startActivity(intent);
            }
        });

        video_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                intent=new Intent(HomepageActivity.this, VideoActivity.class);
                startActivity(intent);
            }
        });


    }
}