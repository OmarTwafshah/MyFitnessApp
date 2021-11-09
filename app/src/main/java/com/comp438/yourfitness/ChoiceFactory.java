package com.comp438.yourfitness;

public class ChoiceFactory {

    public IChoiceDB getModel(){

        return new choiceDB();

    }

}
