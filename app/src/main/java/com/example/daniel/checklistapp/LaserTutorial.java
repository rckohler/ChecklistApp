package com.example.daniel.checklistapp;

import android.content.Context;

import java.lang.reflect.GenericSignatureFormatError;
import java.util.Vector;

/**
 * Created by Daniel on 11/13/2015.
 */
public class LaserTutorial extends Tutorial {

    
    public LaserTutorial(ChecklistApp context) {
        super(context);
        createPages();
        main.setContentView(pages.elementAt(0));
    
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
        
        return new Page(main,this,m,t);
    }

    private Page page2(){


        Textbox t = new Textbox ("Turn on control panel");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("On the machine there is a button towards the bottom left on the front pull the button out that says control panel should turn on and the screen on the machine should turn on."));
        MoreBox m = new MoreBox(textboxes);


        return new Page(main,this,m,t);
    }

    private Page page3(){


        Textbox t = new Textbox ("Turn on air pump");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("Make sure the switch on the wall is on to make sure the air will flow"));
        MoreBox m = new MoreBox(textboxes);


        return new Page(main,this,m,t);
    }

    private Page page4(){


        Textbox t = new Textbox ("Turn on water cooler");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("Make sure the button on the machine is pulled out. "));
        MoreBox m = new MoreBox(textboxes);


        return new Page(main,this,m,t);
    }

    private Page page5(){


        Textbox t = new Textbox ("Place material inside the laser");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("open up the lid "));
        textboxes.add(new Textbox("put your material in "));
        MoreBox m = new MoreBox(textboxes);


        return new Page(main,this,m,t);
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


        return new Page(main,this,m,t);
    }
    private Page page7(){

        Textbox t = new Textbox ("Download file to laser.");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("Click the button that says download towards the left side of the screen half way down. "));
        MoreBox m = new MoreBox(textboxes);


        return new Page(main,this,m,t);
    }
    private Page page8() {

        Textbox t = new Textbox("Adjust the height settings of the laser");


        Vector<Textbox> textboxes = new Vector<>();

        textboxes.add(new Textbox("Grab the piece that has the different thicknesses etched into it. "));
        textboxes.add(new Textbox("Place that piece on your material."));
        textboxes.add(new Textbox("Make sure the laser can move just over the piece"));
        textboxes.add(new Textbox("Flip the piece and move the laser so that it is 1/3 of the way down to the etched line."));


        MoreBox m = new MoreBox(textboxes);

        return new Page(main, this, m, t);
    }
    private Page page9() {


        Textbox t = new Textbox ("Origin and frame the object .");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("There are two green buttons on the laser that say origin and frame press both of those buttons starting with origin then frame. "));

        MoreBox m = new MoreBox(textboxes);


        return new Page(main,this,m,t);
    }



    private Page page10() {


        Textbox t = new Textbox ("Make sure the laser is turned on");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("Make sure the button on the machine is pulled out that says laser "));
        MoreBox m = new MoreBox(textboxes);


        return new Page(main,this,m,t);
    }

    private Page page11() {


        Textbox t = new Textbox ("Run the laser");//morebox
        Vector<Textbox> textboxes = new Vector<>();


        textboxes.add(new Textbox("Press the yellow button that says start/stop and the laser will start making your design  "));
        MoreBox m = new MoreBox(textboxes);


        return new Page(main,this,m,t);
    }
}
