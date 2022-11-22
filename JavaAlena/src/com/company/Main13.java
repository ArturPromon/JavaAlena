package com.company;

import java.util.Arrays;
public class Main13 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        int[][] array2 = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(array2[2][1]);

        int[] array3 = new int[4];
        array3[0] = 1;
        array3[2] = 2;
        array3[1] = 5;
        array3[3] = 10;
        System.out.println(Arrays.toString(array3));


    }
}
