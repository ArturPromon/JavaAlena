package com.company;

import java.util.Arrays;

public class Main28 {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,2,2,3,4,5,-1,-1,-10,-10,-2,7,7,8,2,1,-4};
        Arrays.sort(array);
        int max = array[0];
        int length = 1;
        for(int i = 0; i < array.length; i++){
            if(max<array[i]){
                max = array[i];
                length++;
            }
        }
        System.out.println(Arrays.toString(array));

        int index = 1;
        int[] array2 = new int[length];
        array2[0] = array[0];
        max = array[0];
        for(int i = 0; i < array.length; i++){
            if(max<array[i]){
                max = array[i];
                array2[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array2));

    }
}
