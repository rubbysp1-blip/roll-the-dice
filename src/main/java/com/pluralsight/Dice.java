package com.pluralsight;

public class Dice {
    private int maxValue = 6;
    private int minValue = 1;

    public int roll(){
        //int randomNumber = (int)(Math.random() * (maxValue - minValue + 1)) + minValue
        return (int)(Math.random() * (maxValue - minValue + 1)) + minValue;
    }
}
