package com.example.lulin.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by lulin on 2016/12/9.
 */

public class CaijingActivity extends Activity {
    private String[] data = {"apple","banana","orange"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        TextView textView = new TextView(this);
//        textView.setText("财经新闻");
        setContentView(R.layout.test);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(CaijingActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.test_list);
        listView.setAdapter(adapter);
    }
}
