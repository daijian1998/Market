package com.arcsoft.arcfacedemo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.VideoView;

public class myVedio extends VideoView {
    public myVedio(Context context) {
    super(context);
    }
    public myVedio(Context context, AttributeSet attrs) {
     super(context, attrs);
     }

     public myVedio(Context context, AttributeSet attrs, int defStyleAttr) {
super(context, attrs, defStyleAttr);
 }

            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
 //我们重新计算高度(这样就可以匹配不同手机的尺寸)  
    int width = getDefaultSize(0, widthMeasureSpec);
    int height = getDefaultSize(0, heightMeasureSpec);
                Log.d("daijian",width+"|"+height);
    setMeasuredDimension(width, height);
 }

}

