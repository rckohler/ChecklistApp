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
    public int currentPage = 0;
    public static float screenWidth, screenHeight;
    Vector<Page> pages = new Vector<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay()
                .getMetrics(metrics);
        screenWidth = metrics.widthPixels;
        screenHeight = metrics.heightPixels;
        super.onCreate(savedInstanceState);
        loadImages();
        createPages();

        leftButton = new Button(lbu,lbd,screenWidth*.25f,screenHeight*.2f, screenWidth*.12f);
        rightButton = new Button(rbu,rbd,screenWidth*.75f,screenHeight*.2f, screenWidth*.12f);
        moreButton = new Button(mbu,mbd,screenWidth*.5f,screenHeight*.2f, screenWidth*.12f);
        checkBox = new Button(box,checkbox,screenWidth*.05f,screenHeight*.1f, screenWidth*.04f);

        setContentView(pages.elementAt(currentPage));
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

    public void nextPage(){
        if(currentPage<10){
            currentPage++;
            setContentView(pages.elementAt(currentPage));
        }
    }

    public void lastPage(){
        if(currentPage>0){
            currentPage--;
            setContentView(pages.elementAt(currentPage));
        }
    }
    private void createPages(){
        pages.add(page1());
        pages.add(page2());
        pages.add(page3());
        pages.add(page4());
        pages.add(page5());
        pages.add(page6());
        pages.add(page7());
        pages.add(page8());
        pages.add(page9());
        pages.add(page10());
        pages.add(page11());

    }
    private Page page1(){



        Textbox t = new Textbox ("Import image into morn");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("Go to the top left of the morn program and click file. "));
        textboxes.add(new Textbox("look for import and click that button then select the image."));
        MoreBox m = new MoreBox(textboxes);


        return new Page(this,m,t);
    }

    private Page page2(){


        Textbox t = new Textbox ("Turn on control panel");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("On the machine there is a button towards the bottom left on the front pull the button out that says control panel should turn on and the screen on the machine should turn on."));
        MoreBox m = new MoreBox(textboxes);


        return new Page(this,m,t);
    }

    private Page page3(){


        Textbox t = new Textbox ("Turn on air pump");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("Make sure the switch on the wall is on to make sure the air will flow"));
        MoreBox m = new MoreBox(textboxes);


        return new Page(this,m,t);
    }

    private Page page4(){


        Textbox t = new Textbox ("Turn on water cooler");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("Make sure the button on the machine is pulled out. "));
        MoreBox m = new MoreBox(textboxes);


        return new Page(this,m,t);
    }

    private Page page5(){


        Textbox t = new Textbox ("Place material inside the laser");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("open up the lid "));
        textboxes.add(new Textbox("put your material in "));
        MoreBox m = new MoreBox(textboxes);


        return new Page(this,m,t);
    }
    private Page page6(){


        Textbox t = new Textbox ("Adjust any settings inside of morn");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("Make sure the speed and power are set for the cut/etch that you are going to be using "));
        textboxes.add(new Textbox("Check the pre set options to make sure there is not already a setting that you can use that has been made for you. "));
        textboxes.add(new Textbox("Example power and speed: if I wanted to cut through paper I would want to use the fastest speed and the lowest power so that the laser would not catch on fire. Power 20 Speed 400."));
        textboxes.add(new Textbox("Make sure you have the cuts and etches set to different colors so that they don't overwrite each other. "));
        textboxes.add(new Textbox("Add any other changes to the image in the morn software if you have to. "));
        textboxes.add(new Textbox("Make sure that the image is the correct size you want it to be before the laser starts. "));

        MoreBox m = new MoreBox(textboxes);


        return new Page(this,m,t);
    }
    private Page page7(){

        Textbox t = new Textbox ("Download file to laser.");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("Click the button that says download towards the left side of the screen half way down. "));
        MoreBox m = new MoreBox(textboxes);


        return new Page(this,m,t);
    }
    private Page page8() {

        Textbox t = new Textbox("Adjust the height settings of the laser");


        Vector<Textbox> textboxes = new Vector<>();

        textboxes.add(new Textbox("Grab the piece that has the different thicknesses etched into it. "));
        textboxes.add(new Textbox("Place that piece on your material."));
        textboxes.add(new Textbox("Make sure the laser can move just over the piece"));
        textboxes.add(new Textbox("Flip the piece and move the laser so that it is 1/3 of the way down to the etched line."));


        MoreBox m = new MoreBox(textboxes);

        return new Page(this, m, t);
    }
    private Page page9() {


        Textbox t = new Textbox ("Origin and frame the object .");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("There are two green buttons on the laser that say origin and frame press both of those buttons starting with origin then frame. "));

        MoreBox m = new MoreBox(textboxes);


        return new Page(this,m,t);
    }



    private Page page10() {


        Textbox t = new Textbox ("Make sure the laser is turned on");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("Make sure the button on the machine is pulled out that says laser "));
        MoreBox m = new MoreBox(textboxes);


        return new Page(this,m,t);
    }

    private Page page11() {


        Textbox t = new Textbox ("Run the laser");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("Press the yellow button that says start/stop and the laser will start making your design  "));
        MoreBox m = new MoreBox(textboxes);


        return new Page(this,m,t);
    }
}

