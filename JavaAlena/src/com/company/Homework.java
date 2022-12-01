package com.company;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];
        int count = 0;
        for(int i = a.length - 1; i > -1; i--){
            b[count] = a[i];
            count++;
        }
        System.out.println(Arrays.toString(b));
    }
}
