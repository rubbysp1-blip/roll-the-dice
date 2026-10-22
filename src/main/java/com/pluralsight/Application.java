package com.pluralsight;

public class Application {
    public static void main(String[] args) {

        Dice dice = new Dice();

        int roll1 = 0;
        int roll2 = 0;
        int rolledAtwo = 0;
        int rolledAfour = 0;
        int rolledAsix = 0;
        int rolledAseven = 0;
        int sum = 0;

        for(int roll = 1; roll < 100; roll++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;
//            System.out.println("Roll" + roll +
//                    ": " + roll1 + " - " + roll2 + " Sum: " + sum);
            printSumRoll(roll, roll1, roll2, sum);
            if(sum == 2){
                rolledAtwo += 1;
            }
            if(sum == 4){
                rolledAfour += 1;
            }
            if(sum == 6){
                rolledAsix += 1;
            }
            if(sum == 7){
                rolledAseven += 1;
            }
        }
        System.out.println("Rolled a 2 " + "rolledAtwo" + " times");
        System.out.println(rolledAfour);
        System.out.println(rolledAsix);
        System.out.println(rolledAseven);
    }
    public static void printSumRoll(int roll, int roll1, int roll2, int sum){
        System.out.println("Roll" + roll +
                ": " + roll1 + " - " + roll2 + " Sum: " + sum);
    }
}
