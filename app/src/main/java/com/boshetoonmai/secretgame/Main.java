package com.boshetoonmai.secretgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends Activity implements View.OnClickListener{

    Button bitmap_activity;
    Button imagepick_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        bitmap_activity = (Button) findViewById(R.id.bitmap_btn);
        bitmap_activity.setOnClickListener(this);

        imagepick_activity = (Button) findViewById(R.id.imageView);
        imagepick_activity.setOnClickListener(this);
    }





    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bitmap_btn:
                Intent bitmapIntent = new Intent(this, BitmapActivity.class);
                startActivity(bitmapIntent);
                break;
            case R.id.imageView:
                Intent imageIntent = new Intent(this, imagePick.class);
                startActivity(imageIntent);
                break;
            default:
                break;
        }
    }
}
