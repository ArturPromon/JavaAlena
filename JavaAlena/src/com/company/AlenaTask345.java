package com.company;

public class AlenaTask345 {
    public static void main(String[] args) {
        int[]numbers ={188, 181, 156,162, 173, 152, 169, 193, 185,183};
        float result =0;
        for (int i =0; i < numbers.length; i++){
            result += numbers[i];
        }
        float average = result/numbers.length;
        System.out.println("Result is " + result);
        System.out.println("Average is " + average);

        if (average % 3 !=0){
            System.out.println("Hello");
        }else{
            System.out.println("Error");
        }

        int max;
        int index=0;
        max = numbers[0];
        for (int i=0; i< numbers.length; i++){
            if (max<numbers[i]){
                max=numbers[i];
                index=i;
            }
        }
        System.out.println("Index position of maximum value in the array is "+index);
    }
}
