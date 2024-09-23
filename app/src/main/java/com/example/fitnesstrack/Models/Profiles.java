package com.example.fitnesstrack.Models;


public class Profiles {

    private String name;
    private String fitnessTip;
    private int imageResource;

    public Profiles() {
    }

    public Profiles(String name, String fitnessTip, int imageResource) {
        this.name = name;
        this.fitnessTip = fitnessTip;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getFitnessTip() {
        return fitnessTip;
    }

    public int getImageResource() {
        return imageResource;
    }
}

