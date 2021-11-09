package com.comp438.yourfitness;

import java.util.List;

public interface IChoiceDB {
    List<Choice> getChoice(String yourChoice);

    String[] getname();

}
