package com.example.nowplaying.models;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nowplaying.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String title = getIntent().getStringExtra("title");
    }
}
