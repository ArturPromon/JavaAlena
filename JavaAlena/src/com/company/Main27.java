package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please write some word or sentences: ");
        String someString = scn.nextLine();
        System.out.println("Please write some letter: ");
        String[] array = someString.split(" ");
        char someChar = scn.next().charAt(0);
        int count = 0;
        int total_letters = 0;
        int total_words = 0;

        for(int i = 0; i < someString.length(); i++){
            if(someString.charAt(i) == someChar){
                count++;
            }

            if(someString.charAt(i) != ' '){
                total_letters++;
            }

//            if(someString.charAt(i) == ' '){
//                total_words++;
//            }
        }
        for(String word : array){
            if(!word.equals("")){
                total_words++;
            }
        }

        System.out.println("In a word/sentences " + someString + ", letter '" + someChar + "' seems " + count + " time(s)");
        System.out.println("In a word/sentences total letters " + total_letters + "pc");
        System.out.println("User wrote " + total_words + " word(s)");
    }
}
