package com.boshetoonmai.secretgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends Activity implements View.OnClickListener{

    Button bitmap_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        bitmap_activity = (Button) findViewById(R.id.bitmap_btn);
        bitmap_activity.setOnClickListener(this);
    }

    /**
     *
     * Tut sozdavay onClick event handlery dlya svoey knopki.
     *
     * **/
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bitmap_btn:
                Intent bitmapIntent = new Intent(this, BitmapActivity.class);
                startActivity(bitmapIntent);
                break;
            default:
                break;
        }
    }
}
