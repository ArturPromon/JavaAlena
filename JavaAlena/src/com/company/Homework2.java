package com.company;

public class Homework2 {
    public static void main(String[] args) {
        int[] numbers = {20,10,25,40,30,60};
        int min,max;
        min=max=numbers[0];
        for(int i = 0; i<numbers.length; i++){
            if(max<numbers[i]){
                max = numbers[i];
            }

            if(min>numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println("max is " + max);
        System.out.println("min is " + min);
    }
}
