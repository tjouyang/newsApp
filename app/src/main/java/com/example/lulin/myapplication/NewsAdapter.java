package com.example.lulin.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static com.example.lulin.myapplication.R.id.news_comments;
import static com.example.lulin.myapplication.R.id.news_photo;
import static com.example.lulin.myapplication.R.id.news_title;

/**
 * Created by lulin on 2016/12/10.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    private int resourceId;

    public NewsAdapter(Context context, int textViewResouceId, List<News> object){
        super(context,textViewResouceId,object);
        resourceId = textViewResouceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        News news = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,null);
            viewHolder = new ViewHolder();
            viewHolder.news_photo = (ImageView) view.findViewById(news_photo);
            viewHolder.news_title = (TextView) view.findViewById(news_title);
            viewHolder.news_comments = (TextView) view.findViewById(news_comments);
            view.setTag(viewHolder);
        }
        else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.news_photo.setImageResource(news.getNews_photo_id());
        viewHolder.news_title.setText(news.getNews_title());
        viewHolder.news_comments.setText(news.getNews_comments());
        return view;
    }

    class ViewHolder {
        ImageView news_photo;
        TextView news_title;
        TextView news_comments;
    }
}
