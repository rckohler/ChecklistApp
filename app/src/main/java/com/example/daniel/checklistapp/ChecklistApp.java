package com.example.daniel.checklistapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

import java.util.Vector;

public class ChecklistApp extends Activity {
    public static Bitmap lbu, lbd, rbu,rbd, mbu,mbd,checkbox,box;
    public static Button leftButton, rightButton, moreButton, checkBox;
    public static float screenWidth, screenHeight;
    LaserTutorial laserTutorial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay()
                .getMetrics(metrics);
        screenWidth = metrics.widthPixels;
        screenHeight = metrics.heightPixels;


        super.onCreate(savedInstanceState);
        loadImages();
        leftButton = new Button(lbu,lbd,screenWidth*.25f,screenHeight*.2f, screenWidth*.12f);
        rightButton = new Button(rbu,rbd,screenWidth*.75f,screenHeight*.2f, screenWidth*.12f);
        moreButton = new Button(mbu,mbd,screenWidth*.5f,screenHeight*.2f, screenWidth*.12f);
        checkBox = new Button(box,checkbox,screenWidth*.05f,screenHeight*.1f, screenWidth*.04f);
        laserTutorial = new LaserTutorial(this);


    }
    public void setView(Page p){
        setContentView(p);
    }

    private void loadImages(){
        lbu = BitmapFactory.decodeResource(getResources(),R.drawable.blu);
        lbd = BitmapFactory.decodeResource(getResources(),R.drawable.bld);
        rbu = BitmapFactory.decodeResource(getResources(),R.drawable.bru);
        rbd = BitmapFactory.decodeResource(getResources(),R.drawable.brd);
        mbu = BitmapFactory.decodeResource(getResources(),R.drawable.mbu);
        mbd = BitmapFactory.decodeResource(getResources(),R.drawable.mbd);
        box = BitmapFactory.decodeResource(getResources(),R.drawable.box);
        checkbox = BitmapFactory.decodeResource(getResources(),R.drawable.checkbox);


    }
    public static void resetButtons(){
        rightButton.reset();
        leftButton.reset();
       // checkBox.reset();
        moreButton.reset();
    }



}

