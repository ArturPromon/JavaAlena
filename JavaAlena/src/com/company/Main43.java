package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main43 {
    public static void main(String[] args) {
        int[] array = new int[]{2,1,1,4,5,4,-1,3,3};
        Arrays.sort(array);
        removeDouble(array,array.length);
    }
    public static void removeDouble(int array[], int n){
        int[] temp = new int[n];
        int j = 0;
        for(int i =0; i< n-1;i++){
            if(array[i] != array[i+1]){
                temp[j] = array[i];
                j++;
            }
        }
        temp[j] = array[n-1];
        j++;
        for(int i =0; i<j;i++){
            System.out.println(temp[i]);
        }
    }
}
