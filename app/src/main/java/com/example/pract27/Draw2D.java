package com.example.pract27;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Draw2D extends View {

    private Paint mPaint = new Paint();
    private Rect mRect = new Rect();
    private Bitmap mBitmap;    private Bitmap mStars;

    public Draw2D(Context context) {
        super(context);

        // Выводим значок из ресурсов
        Resources res = this.getResources();
        mBitmap = BitmapFactory.decodeResource(res, R.drawable.kote);
        mStars = BitmapFactory.decodeResource(res, R.drawable.stars);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();

        mPaint.setStyle(Paint.Style.FILL);


        mPaint.setColor(Color.BLUE);
        canvas.drawPaint(mPaint);


        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.WHITE);
        // canvas.drawCircle(950, 30, 25, mPaint);
        canvas.drawCircle(width - 30, 30, 200, mPaint);



        mPaint.setColor(Color.GREEN);
        canvas.drawRect(0, getHeight() - 300, width, height, mPaint);

        // Рисуем текст
        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(50);
        canvas.drawText("Найди кота", 30, height - 32, mPaint);

        // Текст под углом
        // int x = 810;
        int x = width - 220;
        int y = 350;

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(50);
        String beam = "Простой текст!";

        canvas.save();
        
        canvas.rotate(-135, x + mRect.exactCenterX(), y + mRect.exactCenterY());

        // Рисуем текст
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(beam, x-400, y-300, mPaint);

        // восстанавливаем холст
        canvas.restore();

        // Выводим изображение
        canvas.drawBitmap(mBitmap, width - mBitmap.getWidth(), height - mBitmap.getHeight() - 10, mPaint);
        canvas.drawBitmap(mStars, width - mStars.getWidth() - 500, height - mStars.getHeight() - 500, mPaint);
    }
}
