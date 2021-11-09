package com.comp438.yourfitness;

public class PriceFactory {
    public IPriceDB getModel(){

        return new PriceDB();

    }
}
