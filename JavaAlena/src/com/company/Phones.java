package com.company;

public class Phones {
    public static void main(String[] args) {
        PhonesDemo Apple = new PhonesDemo();
        PhonesDemo Samsung = new PhonesDemo();
        PhonesDemo Xiaomi = new PhonesDemo("A406",299,32);
        PhonesDemo2 LG = new PhonesDemo2();
        PhonesDemo2 Nokia = new PhonesDemo2("Z10", 499, "White");
        PhonesDemo2 Motorolla = new PhonesDemo2("5566", 500);
        LG.price = 500;
        LG.model = "Aram";
        LG.memory= 256;
        LG.color = "Black";
        Apple.model="XR";
        Apple.price= 1000;
        Apple.memory= 64;
        Samsung.model = "S21";
        Samsung.price = 800;
        Samsung.memory = 128;

        System.out.println(Apple.model + " " + Apple.price + " " + Apple.memory);
        System.out.println(Samsung.model + " " + Samsung.price + " " + Samsung.memory);
        System.out.println(Xiaomi.model + " " + Xiaomi.price + " " + Xiaomi.memory);
        System.out.println(LG.model + " " + LG.price + " " + LG.memory + " " + LG.color);
        System.out.println(Nokia.model + " " + Nokia.price + " " + Nokia.color);

    }
}
