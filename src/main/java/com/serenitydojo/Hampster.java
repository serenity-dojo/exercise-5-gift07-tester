package com.serenitydojo;

public class Hampster extends Pet {
    private String favoritegame;


    public Hampster(String name,String favoritegame,int age){
        super(name,age);
        this.favoritegame = favoritegame;

    }
    public String getFavoritegame(){
        return favoritegame;
    }

    @Override
    public String makeNoise(){
        return "Squeaky";
    }
    @Override
    public String play(){
        return "runs in wheel";
    }



}
