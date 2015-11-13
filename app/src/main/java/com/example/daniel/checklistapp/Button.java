package com.example.daniel.checklistapp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;

/**
 * Created by Daniel on 10/21/2015.
 */
public class Button {
    RectF bounds;
    float xPos, yPos;
    Bitmap bitmap=ChecklistApp.box;
    Bitmap bitmapUp;
    Bitmap bitmapDown;
    boolean isActive = true;

    public Button(Bitmap bitmapUp, Bitmap bitmapDown, float xPos, float yPos, float radius){
        bounds = new RectF(xPos-radius,yPos-radius,xPos+radius,yPos+radius);
        this.bitmapUp = bitmapUp;
        this.bitmapDown = bitmapDown;
        this.bitmap = bitmapUp;
    }

    public void reset(){
        bitmap= bitmapUp;
        isActive=true;

    }

    public boolean isClicked(float clickX, float clickY){
        boolean ret = false;
        if(bounds.contains(clickX,clickY) && isActive){
            if(bitmap == bitmapUp) bitmap = bitmapDown;
            else if(bitmap == bitmapDown) {
                bitmap = bitmapUp;
                ret =  true;
            }

        }
        return ret;
    }

    public void update(Canvas canvas){

        canvas.drawBitmap(bitmap,null,bounds,null);
    }
}
