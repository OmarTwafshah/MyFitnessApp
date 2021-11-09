package com.comp438.yourfitness;

public class BMI {
    private String status ;
    private double BMINumber ;

    public BMI(){}

    public BMI(String status, double BMINumber) {
        this.status = status;
        this.BMINumber = BMINumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBMINumber() {
        return BMINumber;
    }

    public void setBMINumber(double BMINumber) {
        this.BMINumber = BMINumber;
    }
}
