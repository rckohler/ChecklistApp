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


    public Page(Context context,MoreBox m,Textbox t) {
        super(context);
        main = (ChecklistApp)(context);
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
        if (ChecklistApp.moreButton.isClicked(clickX,clickY)){
            if (moreBox.isVisible) moreBox.isVisible = false;
            else moreBox.isVisible = true;
        }
        //handle next and back page buttons
        if (ChecklistApp.rightButton.isClicked(clickX, clickY))
            main.nextPage();
        if (ChecklistApp.leftButton.isClicked(clickX, clickY))
            main.lastPage();


        //handle checkbox
        if (ChecklistApp.checkBox.isClicked(clickX,clickY)){
            ChecklistApp.checkBox.isActive=false;
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
            main.nextPage();
        if (ChecklistApp.leftButton.isClicked(clickX, clickY))
            main.lastPage();


        //handle checkbox
        if (ChecklistApp.checkBox.isClicked(clickX,clickY)){
            ChecklistApp.checkBox.isActive=false;
        }
        //if the checkbox has been clicked add the checkbox arrow to the checkbox
        //handle more button
        ChecklistApp.resetButtons();
            moreBox.resetButtons();
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
