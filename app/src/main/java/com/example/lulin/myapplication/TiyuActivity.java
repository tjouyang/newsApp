package com.example.lulin.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lulin on 2016/12/9.
 */

public class TiyuActivity extends Activity {

    private List<News> newsList = new ArrayList<News>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.news_page);
        initTiyuNews();
        NewsAdapter newsAdapter = new NewsAdapter(TiyuActivity.this,R.layout.news_item,newsList);
        ListView listView = (ListView) findViewById(R.id.news_list);
        listView.setAdapter(newsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                News news = newsList.get(position);
                String desc = news.getNews_desc();
                int photo = news.getNews_photo_id();
                Intent intent = new Intent(TiyuActivity.this,NewsDesc.class);
                intent.putExtra("photo",photo);
                intent.putExtra("desc",desc);
                startActivity(intent);
            }
        });
    }
    public void initTiyuNews(){
        News news1 = new News("标题一",R.drawable.one,"新闻详情，你是到付看您说的v客户为回复速度看能否肯定附件为空你的水库附近看","15");
        newsList.add(news1);
        News news2 = new News("标题二",R.drawable.two,"新闻详情，你是到付看您说的v客户为回复速度看能否肯定附件为空你的水库附近看","45");
        newsList.add(news2);
        News news3 = new News("标题三",R.drawable.three,"新闻详情，你是到付看您说的v客户为回复速度看能否肯定附件为空你的水库附近看","2");
        newsList.add(news3);
        News news4 = new News("标题四",R.drawable.four,"新闻详情，你是到付看您说的v客户为回复速度看能否肯定附件为空你的水库附近看","7");
        newsList.add(news4);
        News news5 = new News("标题五",R.drawable.five,"新闻详情，你是到付看您说的v客户为回复速度看能否肯定附件为空你的水库附近看","4");
        newsList.add(news5);
        News news6 = new News("标题六",R.drawable.six,"新闻详情，你是到付看您说的v客户为回复速度看能否肯定附件为空你的水库附近看","78");
        newsList.add(news6);
        News news7 = new News("标题七",R.drawable.seven,"新闻详情，你是到付看您说的v客户为回复速度看能否肯定附件为空你的水库附近看","34");
        newsList.add(news7);
    }
}
