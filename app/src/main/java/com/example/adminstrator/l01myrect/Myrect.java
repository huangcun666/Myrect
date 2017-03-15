package com.example.adminstrator.l01myrect;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public class Myrect extends View {
    public Myrect(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray ta=context.obtainStyledAttributes(attrs,R.styleable.MyView);
       int Mycolor=ta.getColor(R.styleable.MyView_MyRect_color,0xffff9999);
        setBackgroundColor(Mycolor);
        ta.recycle();
    }
    public Myrect(Context context) {
        super(context);
    }
}
