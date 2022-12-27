package com.company;

public class Final_Static {
    public static void main(String[] args) {
        int x = Final_Static_Demo.a;
        System.out.println(x);
        Final_Static_Demo object = new Final_Static_Demo();
        object.b = 10;
        object.a = 15;
        System.out.println(object.a);
        System.out.println(Final_Static_Demo.a);
        int a = Final_Static_Demo.Do(15);
        System.out.println(a);
        int b = object.Doo(20);
        System.out.println(b);

    }
}
