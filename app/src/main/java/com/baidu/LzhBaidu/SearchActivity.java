package com.baidu.LzhBaidu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

public class SearchActivity extends Activity {
    private SearchView mSearchView;
    private Button home_button;
    private Button video_button;
    private Button homepage_button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);

        home_button = findViewById(R.id.home_button);
        video_button = findViewById(R.id.vedio_button);
        homepage_button = findViewById(R.id.homepage_button);
        mSearchView = findViewById(R.id.searchView);

        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Intent intent = new Intent(SearchActivity.this, WebActivity.class);
                intent.putExtra("target", query);
                startActivity(intent);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SearchActivity.this, MainActivity.class));
            }
        });

        homepage_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SearchActivity.this, HomepageActivity.class));
            }
        });

        video_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SearchActivity.this, VideoActivity.class));
            }
        });
    }
}
