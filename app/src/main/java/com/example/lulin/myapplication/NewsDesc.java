package com.example.lulin.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lulin on 2016/12/11.
 */

public class NewsDesc extends Activity {
    private ImageView news_photo;
    private TextView news_desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_activity);
        news_photo = (ImageView) findViewById(R.id.news_photo);
        news_desc = (TextView) findViewById(R.id.news_desc);
        Intent intent = getIntent();
        int photo = intent.getIntExtra("photo",R.drawable.one);
        String desc = intent.getStringExtra("desc");
        news_photo.setImageResource(photo);
        news_desc.setText(desc);
    }
}
