package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Please enter some value: ");
        a = scn.nextInt();
        // ==, !=, >, <, >=, <=, или ||, и &&
        if(a> 10) {
            System.out.println("a = " + a);
        } else if (a==10) {
            System.out.println("a is 10");
        } else {
            System.out.println("Error");
        }

    }
}
