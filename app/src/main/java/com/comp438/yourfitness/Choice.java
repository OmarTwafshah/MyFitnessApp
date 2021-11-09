package com.comp438.yourfitness;

public class Choice {
    private String yourChoice;
    private String name ;

    public Choice(){}


    public Choice(String yourChoice, String name) {
        this.yourChoice = yourChoice;
        this.name = name;
    }

    public String getYourChoice() {
        return yourChoice;
    }

    public void setYourChoice(String yourChoice) {
        this.yourChoice = yourChoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
