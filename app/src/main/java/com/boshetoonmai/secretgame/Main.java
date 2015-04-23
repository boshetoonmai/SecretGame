package com.boshetoonmai.secretgame;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Main extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        Log.d("test", "test");
    }
}
