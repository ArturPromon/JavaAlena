package com.company;

public class Main10 {
    public static void main(String[] args) {
        boolean isTrue = true;
        int num = 0;
        while(isTrue){
            num++;
            if(num>3){
                isTrue = false;
            }
            System.out.println("Hello");
        }

        int i = 0;
        while(true){
            System.out.println("Hello world!");
            if(i>3){
                break;
            }
            i++;
        }

        int j = 0;
        while(j<3){
            System.out.println("Hello Alena");
            j++;
        }
    }
}
