package com.comp438.yourfitness;

import java.util.List;

public interface IPriceDB {
    List<Price> getPrice(int numberOfMonth);

}
