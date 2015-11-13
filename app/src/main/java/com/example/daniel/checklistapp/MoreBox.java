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
    Button rightB, leftB;
    public MoreBox(Vector<Textbox>t, Vector<Bitmap> b){
        rightB = new Button(ChecklistApp.rbu, ChecklistApp.rbd,pageWidth*.75f,pageHeight*.08f,pageWidth*.1f);
        leftB = new Button(ChecklistApp.lbu, ChecklistApp.lbd,pageWidth*.35f,pageHeight*.08f,pageWidth*.1f);

        this.bitmaps = b;
        this.textboxes = t;
        placeTextBoxAndButtons();
    }
    public MoreBox(Vector<Textbox>t){
        rightB = new Button(ChecklistApp.rbu, ChecklistApp.rbd,pageWidth*.75f,pageHeight*.08f,pageWidth*.1f);
        leftB = new Button(ChecklistApp.lbu, ChecklistApp.lbd,pageWidth*.35f,pageHeight*.08f,pageWidth*.1f);
        this.textboxes = t;
        placeTextBoxAndButtons();
    }

    public MoreBox(Textbox t){
        this.textboxes.add(t);
        rightB = new Button(ChecklistApp.rbu, ChecklistApp.rbd,pageWidth*.75f,pageHeight*.08f,pageWidth*.1f);
        leftB = new Button(ChecklistApp.lbu, ChecklistApp.lbd,pageWidth*.35f,pageHeight*.08f,pageWidth*.1f);
        placeTextBoxAndButtons();

    }

    private void placeTextBoxAndButtons(){
        for(int i = 0; i < textboxes.size();i++) {
            textboxes.elementAt(i).x = pageWidth * .2f;
            textboxes.elementAt(i).y = pageHeight * .5f;
        }
        rightB = new Button(ChecklistApp.rbu, ChecklistApp.rbd,pageWidth*.9f,pageHeight*.5f,pageWidth*.08f);
        leftB = new Button(ChecklistApp.lbu, ChecklistApp.lbd,pageWidth*.1f,pageHeight*.5f,pageWidth*.08f);

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

    public void nextPage(){
        if(page < textboxes.size()-1) page++;
    }

    public void lastPage(){
        if(page > 0) page--;
    }


}
