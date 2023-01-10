package com.company;

public class alenatest {
    public static void main(String[] args) {
        int num = (int) Math.round(Math.random() * 100);
        System.out.println(domath(num));
    }
    public static boolean domath(int num){
        if(num>50){
            return  true;
        }else{
            return false;
        }
    }
}
