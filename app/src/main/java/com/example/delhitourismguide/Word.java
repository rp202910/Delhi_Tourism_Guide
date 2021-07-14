package com.example.delhitourismguide;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Word {
    private String placeName;
    private int image;
    private String getl;
    private String webk;
    public Word(String name,int image1,String location,String web){

        placeName=name;
        image=image1;
        getl=location;
        webk=web;
    }
    public Word(String name,int image1,String web){

        placeName=name;
        image=image1;
        webk=web;
    }
    public String getWord(){
        return placeName;

    }
    public int getImage(){
        return image;
    }
    public String getUrl(){
        return webk;
    }
    public String getLocation(){
        return getl;
    }

}
