package com.company;

public class Recursion {
    public static void main(String[] args){
       int result = sum(15);
       System.out.println(result);
    }
    public static int sum(int a){
        if(a>0){
           return a + sum(a-2);
        }else{
            return 0;
        }
    }
}
