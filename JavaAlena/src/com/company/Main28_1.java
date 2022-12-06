package com.company;

import java.util.Arrays;

public class Main28_1 {
    public static void main(String[] args) {
        int[] array = {1,2,2,1,4,4,4,1,3,10};
        Arrays.sort(array);
        int somevalue = array[0];
        for(int i =1; i < array.length;i++){
            if(somevalue != array[i]){
                somevalue = array[i];
                System.out.println(somevalue);
            }
        }
    }
}
