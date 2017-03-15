package com.example.drawapi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Adminstrator on 2017/1/14.
 */

public class Rotatingrect extends View {
    private Paint p;
    private float d=0;
    private void initProperityes(){
                p=new Paint();
                p.setColor(Color.RED);
    }
    public Rotatingrect(Context context) {
        super(context);
        initProperityes();
    }

    public Rotatingrect(Context context, AttributeSet attrs) {
        super(context, attrs);
        initProperityes();
    }

    public Rotatingrect(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initProperityes();
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.save()
        canvas.rotate(d,250,250);
        canvas.translate(200,200);
        canvas.drawRect(0,0,100,100,p);
        d ++;
        canvas.restore();
        invalidate();// 使无效；使无价值
    }
}
