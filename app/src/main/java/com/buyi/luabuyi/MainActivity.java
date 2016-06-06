package com.buyi.luabuyi;

import android.app.Activity;
import android.os.Bundle;

import com.taobao.luaview.global.LuaView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        LuaView view = LuaView.create(this);
        view.load("hello.lua");
        setContentView(view);
    }
}
