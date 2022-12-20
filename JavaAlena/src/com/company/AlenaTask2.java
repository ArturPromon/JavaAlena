package com.company;

public class AlenaTask2 {
    public static void main(String[] args) {
        boolean isTrue=true;
        int min = 100;
        int max= 200;
        int i = 0;
        while (isTrue){
                int num = (int) Math.round(Math.random() * (max-min)+min);
                System.out.println("Random is " + num);
                i++;
                if(i>9){
                    isTrue=false;
                }
        }

    }
}
