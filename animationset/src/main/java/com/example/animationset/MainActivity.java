package com.example.animationset;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

public class MainActivity extends AppCompatActivity {
    private AnimationSet as;
    private TranslateAnimation ta;
    private AlphaAnimation aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        as=new AnimationSet(true);
        as.setDuration(1000);
        ta=new TranslateAnimation(200,0,200,0);
        ta.setDuration(1000);
        as.addAnimation(ta);
        aa=new AlphaAnimation(0,1);
        as.addAnimation(aa);
        findViewById(R.id.but).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(as);
            }
        });
    }
}
