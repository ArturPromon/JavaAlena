package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main33 {
    public static void main(String[] args) {
        String[] months = new String[]{"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter some month: ");
        String month = scn.nextLine();

        if(Arrays.asList(months).contains(month)){
           int numofmonth  = Arrays.asList(months).indexOf(month);
           numofmonth++;
           System.out.println(numofmonth);
        }

    }
}
