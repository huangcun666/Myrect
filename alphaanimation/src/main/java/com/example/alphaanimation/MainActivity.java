package com.example.alphaanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.but).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          /*      AlphaAnimation a=new AlphaAnimation(0,1);
                a.setDuration(1000);
                view.startAnimation(a);*/
                view.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.aa));
            }
        });
    }
}
