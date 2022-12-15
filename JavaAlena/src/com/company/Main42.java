package com.company;

public class Main42 {
    public static void main(String[] args) {
        int a =5;
        int b = 10;
        System.out.println(sum(a,b));
        System.out.println(sum());
        System.out.println(sum(5,10,15));
        System.out.println(sum(5f,10f));
        boolean[] array = {true,false, false,false,true};

        method:
        for(int i = 0; i < array.length;i++){
            System.out.println(sum(5,array[i]));
        }

    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(){
        int a, b;
        a = 10;
        b= 15;
        int result = a+b;
        return result;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static int sum(int a, boolean b){
        if(b){
            a = a*a*a;
            return a;
        }else{
            a = a*a;
            return a;
        }
    }

    public static float sum(float a, float b){
        return a+b;
    }
}
