package com.example.daniel.checklistapp;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

import java.util.Vector;

/**
 * Created by Daniel on 10/21/2015.
 */
public class Page extends View {
    MoreBox moreBox;
    Textbox textbox;
    ChecklistApp main;
    Tutorial tutorial;

    public Page(Context context, Tutorial tutorial, MoreBox m,Textbox t) {
        super(context);
        main = (ChecklistApp)(context);
        this.tutorial = tutorial;
        textbox = t;
        moreBox = m;

    }


    public boolean onTouchEvent(MotionEvent event){
        float clickX, clickY;
        clickX = event.getX();
        clickY = event.getY();
        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:

            //handle morebox buttons
            if (moreBox.rightB.isClicked(clickX, clickY))
            {
                moreBox.nextPage();
            }
            if (moreBox.leftB.isClicked(clickX, clickY)) {
                moreBox.lastPage();
            }

            //handle next and back page buttons
            if (ChecklistApp.rightButton.isClicked(clickX, clickY))
                tutorial.nextPage();
            if (ChecklistApp.leftButton.isClicked(clickX, clickY))
                tutorial.lastPage();

            if (ChecklistApp.moreButton.isClicked(clickX,clickY)){
                if (moreBox.isVisible) moreBox.isVisible = false;
                else moreBox.isVisible = true;
            }

            //if the checkbox has been clicked add the checkbox arrow to the checkbox
            //handle more button
            break;

            case MotionEvent.ACTION_UP:

            //handle morebox buttons
            if (moreBox.rightB.isClicked(clickX, clickY))
            {
                moreBox.nextPage();
            }
            if (moreBox.leftB.isClicked(clickX, clickY)) {
                moreBox.lastPage();
            }
            if (ChecklistApp.moreButton.isClicked(clickX,clickY)){
                if (moreBox.isVisible) moreBox.isVisible = false;
                else moreBox.isVisible = true;
            }
            //handle next and back page buttons
            if (ChecklistApp.rightButton.isClicked(clickX, clickY))
                tutorial.nextPage();
            if (ChecklistApp.leftButton.isClicked(clickX, clickY))
                tutorial.lastPage();


            //handle checkbox
            if (ChecklistApp.checkBox.isClicked(clickX,clickY)){
                ChecklistApp.checkBox.bitmap = ChecklistApp.checkBox.bitmapDown;
                ChecklistApp.checkBox.isActive=false;
            }
            //if the checkbox has been clicked add the checkbox arrow to the checkbox
            //handle more button
            ChecklistApp.resetButtons();
                moreBox.leftB.reset();
                moreBox.rightB.reset();
                break;
        }
    return true;
    }

    public void update(Canvas canvas){
        moreBox.update(canvas);
        ChecklistApp.checkBox.update(canvas);
        ChecklistApp.rightButton.update(canvas);
        ChecklistApp.leftButton.update(canvas);
        ChecklistApp.moreButton.update(canvas);
        textbox.update(canvas);
    }

    protected void onDraw(Canvas canvas) {
        //drawEach(canvas);
        update(canvas);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) { }
        invalidate();
    }
}
