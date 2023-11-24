package com.example.pract27;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Draw2D draw2D = new Draw2D(this);
        setContentView(draw2D);
    }
//    private Paint mPaint = new Paint();
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
//
//        // стиль Заливка
//        mPaint.setStyle(Paint.Style.FILL);
//
//        // закрашиваем холст белым цветом
//        mPaint.setColor(Color.WHITE);
//        canvas.drawPaint(mPaint);
//    }
}