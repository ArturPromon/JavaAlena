package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        BufferedReader file = null;
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter some letter: ");
        char letter = scn.next().toLowerCase().charAt(0);
        char letterUp = Character.toUpperCase(letter);
        String[] array;
        try{
            file = new BufferedReader(new FileReader("src/com/company/test.txt"));
            String line;
            int countLetter;
            int countWords;
            int totalletters;
            while((line = file.readLine()) != null){
                countLetter = 0;
                countWords = 0;
                totalletters = 0;
                array = line.split(" ");
                for(int i = 0; i < array.length; i++){
//                    array[i] = array[i].substring(1) + Character.toUpperCase(array[i].charAt(1)) + array[i].substring(2, array[i].length());
                }
                System.out.println(Arrays.toString(array));
                for(int i =0; i<line.length();i++){
                    if(line.charAt(i) == letter || line.charAt(i) == letterUp){
                        countLetter++;
                    }
                }

                for(String element: array){
                    countWords++;
                }

                for(int i = 0; i<line.length(); i++){
                    if(line.charAt(i) != ' '){
                        totalletters++;
                    }
                }
                System.out.println("Letter " + letter + " seems " + countLetter + " time(s)");
                System.out.println("Total words: " +countWords);
            }
        }

        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
