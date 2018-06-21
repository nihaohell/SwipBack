package com.c114.baseactivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.c114.baseactivity.base.avtivities.swipe.SwipeBackActivity;

/**
 * Created by c114 on 2018/6/21.
 */

public class Activity1 extends SwipeBackActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSwipeBackEnable(true);
        setContentView(R.layout.activity_act1);
    }
    public static void show(Context context){
        context.startActivity(new Intent(context,Activity1.class));
    }
}
