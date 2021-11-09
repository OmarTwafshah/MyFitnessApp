package com.comp438.yourfitness;

public class Price {

    private int numberOfMonth ;
    private double PricePerMonth ;

    public Price(){}

    public Price(int numberOfMonth, double pricePerMonth) {
        this.numberOfMonth = numberOfMonth;
        this.PricePerMonth = pricePerMonth;
    }

    public int getNumberOfMonth() {
        return numberOfMonth;
    }

    public void setNumberOfMonth(int numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
    }

    public double getPricePerMonth() {
        return PricePerMonth;
    }

    public void setPricePerMonth(double pricePerMonth) {
        PricePerMonth = pricePerMonth;
    }
}
