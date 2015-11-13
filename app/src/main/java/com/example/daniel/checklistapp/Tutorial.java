package com.example.daniel.checklistapp;

import android.content.Context;
import android.graphics.Canvas;

import java.util.Vector;

/**
 * Created by Daniel on 10/21/2015.
 */
public class Tutorial {
    Vector<Page> pages = new Vector<>();
    int currentPage = 0;
    ChecklistApp main;

    public Tutorial(Context context){
        main = (ChecklistApp)context;
    }

    public void nextPage(){
        if(currentPage<10){
            currentPage++;
            main.setContentView(pages.elementAt(currentPage));
            main.checkBox.reset();
        }
    }

    public void lastPage(){
        if(currentPage>0){
            currentPage--;
            ChecklistApp.checkBox.reset();
            main.setContentView(pages.elementAt(currentPage));
        }
    }



}
