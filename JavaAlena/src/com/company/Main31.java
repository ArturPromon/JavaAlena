package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main31 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Dodge");

        Collections.sort(cars);
        System.out.println(cars);

    }
}
