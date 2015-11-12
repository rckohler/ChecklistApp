package com.example.daniel.checklistapp;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.Vector;

/**
 * Created by Daniel on 10/21/2015.
 */
public class MoreBox {
    boolean isVisible = false;
    int page = 0;
    float pageWidth = ChecklistApp.screenWidth;
    float pageHeight = ChecklistApp.screenHeight;

    Vector<Textbox> textboxes = new Vector<>();
    Vector<Bitmap> bitmaps = null;
    int charactersPerLine = 20;
    float x,y;
    Bitmap buttonBitmap = null;
    Button rightB, leftB;
    public MoreBox(Vector<Textbox>t, Vector<Bitmap> b){
        rightB = new Button(ChecklistApp.rbu, ChecklistApp.rbd,pageWidth*.75f,pageHeight*.08f,pageWidth*.1f);
        leftB = new Button(ChecklistApp.lbu, ChecklistApp.lbd,pageWidth*.35f,pageHeight*.08f,pageWidth*.1f);

        this.bitmaps = b;
        this.textboxes = t;
    }

    public MoreBox(Vector<Textbox>t){
        this.textboxes = t;
    }

    public MoreBox(Textbox t){
        this.textboxes.add(t);

    }

    public void update(Canvas canvas){
        if(isVisible){
            // draw lines
            textboxes.elementAt(page).update(canvas);
            // draw buttons
            leftB.update(canvas);
            rightB.update(canvas);


        }
    }


}
