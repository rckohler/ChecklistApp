package com.example.daniel.checklistapp;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

import java.util.Vector;

/**
 * Created by Daniel on 10/21/2015.
 */
public class Textbox {
    byte charactersPerLine = 40;
    float x,y;
    float badNumber = 20;
    Paint paint;
    Vector<String> lines = new Vector<>();
    public Textbox (Vector<String> lines){
        this.lines = lines;
    }

    public Textbox (String line, float x, float y){
        this.x = x;
        this.y = y;
        paint = new Paint();
        paint.setTextSize(badNumber);
        paint.setColor(Color.BLACK);
        lines = convertLines(line);
    }

    public Textbox (String line){
        paint = new Paint();

        paint.setTextSize(badNumber);
        paint.setColor(Color.BLACK);
        lines = convertLines(line);
    }

    private Vector<String> convertLines(String fedString) {
        String longString = fedString;
        Vector<String> lines = new Vector<>();
        int spacePoint = charactersPerLine;
        int da,db,dc;
        String subString;
        while (longString.length() > charactersPerLine) {
            subString = longString.substring(0, charactersPerLine);

                //subString = subString.substring(0, subString.lastIndexOf(" "));
            int x = subString.lastIndexOf(" ");
            if(x !=-1) {
                subString = longString.substring(0, x);
                lines.add(subString);
                longString = longString.substring(subString.length(), longString.length());
                da = subString.length();
                db = longString.length();
                dc = 1;

            }


        }
        lines.add(longString);
        return lines;
    }


    public void update(Canvas canvas){
        for (int i = 0; i < lines.size(); i++) {
            canvas.drawText(lines.elementAt(i),x,y,paint);
            y+=badNumber*1.5;
        }
    }
}
