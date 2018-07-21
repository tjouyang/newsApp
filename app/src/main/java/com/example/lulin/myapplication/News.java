package com.example.lulin.myapplication;

/**
 * Created by lulin on 2016/12/9.
 */

public class News {
    private String news_title;
    private int news_photo_id;
    private String news_comments;
    private String news_desc;
    public News(String news_title,int news_photo_id,String news_desc,String news_comments){
        this.news_title = news_title;
        this.news_photo_id = news_photo_id;
        this.news_desc = news_desc;
        this.news_comments = news_comments;
    }

    public String getNews_title(){
        return news_title;
    }

    public int getNews_photo_id(){
        return news_photo_id;
    }

    public String getNews_desc(){
        return news_desc;
    }

    public String getNews_comments() {
        return news_comments;
    }
}
