package com.xwlljj.stu.xutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.iv_typhon)
    private ImageView ivTyphon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }

    @Event(value = R.id.btn_test)
    private void testClick(View v) {
        Toast.makeText(this, "lsgdkls", Toast.LENGTH_LONG).show();
        String url = "http://i.weather.com.cn/i/c/images/2008/20081223/49509216_d1d7a.jpg";
        x.image().bind(ivTyphon, url);
    }
}
