package com.xwlljj.stu.xutils;

import android.app.Application;

import org.xutils.x;

/**
 * Created by XieWei on 2016/7/9.
 */
public class StuXutilsApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true);
    }
}
