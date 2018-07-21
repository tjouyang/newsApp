package com.example.lulin.myapplication;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this,TiyuActivity.class);
        spec = tabHost.newTabSpec("体育").setIndicator("体育").setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this,CaijingActivity.class);
        spec = tabHost.newTabSpec("财经").setIndicator("财经").setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this,YuleActivity.class);
        spec = tabHost.newTabSpec("娱乐").setIndicator("娱乐").setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this,KejiActivity.class);
        spec = tabHost.newTabSpec("科技").setIndicator("科技").setContent(intent);
        tabHost.addTab(spec);
    }

}
