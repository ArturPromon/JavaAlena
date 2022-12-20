package com.company;

import java.util.Scanner;

public class Alenatask7 {
    public static void main(String[] args) {
        System.out.println("The amount of money in dollars is " + currency() + " $.");
    }

    public static double currency(){
        float euro, dollar;
        System.out.println("Please enter an amount of money in euro: ");
        Scanner scn = new Scanner(System.in);
        euro = scn.nextFloat();
        dollar = euro * 1.06f; //the exchange rate as of 19th December 2022
        double result = dollar;
        return Math.round(result * 100.0)/ 100.0;
    }
}
