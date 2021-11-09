package com.comp438.yourfitness;

import java.util.ArrayList;
import java.util.List;

public class PriceDB implements IPriceDB{

    private ArrayList<Price> prices = new ArrayList<>();

    public PriceDB(){
        prices.add(new Price(1,120));
        prices.add(new Price(2,240));
        prices.add(new Price(3,340));
        prices.add(new Price(4,440));
        prices.add(new Price(5,520));
        prices.add(new Price(6,600));
        prices.add(new Price(7,700));
        prices.add(new Price(8,790));
        prices.add(new Price(9,850));
        prices.add(new Price(10,920));
        prices.add(new Price(11,1000));
        prices.add(new Price(12,1050));
    }

    public List<Price> getPrice(int numberOfMonth){
        ArrayList<Price> data = new ArrayList<>();
        for(Price p : prices){
            if(p.getNumberOfMonth() == (numberOfMonth)){
                data.add(p);
            }
        }
        return data;
    }
}
