package com.comp438.yourfitness;

import java.util.ArrayList;
import java.util.List;

public class choiceDB implements IChoiceDB{
    private ArrayList<Choice> choice = new ArrayList<>();

    public choiceDB(){
        choice.add(new Choice("Go check your BMI and health","MainActivity3"));
        choice.add(new Choice("Go to see the best training","MainActivity4"));
        choice.add(new Choice("Go to the timer if you want to running","MainActivity5"));
    }

    public List<Choice> getChoice(String yourChoice){
        ArrayList<Choice> data = new ArrayList<>();
        for(Choice c : choice){
            if(c.getYourChoice() .equals (yourChoice)){
                data.add(c);
            }
        }
        return data;
    }


    public String[] getname(){
        String[] data = {"Go check your BMI and health","Go to see the best training","Go to the timer if you want to running"};



        return data ;
    }
}
