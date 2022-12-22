package com.company;

public class Phones {
    public static void main(String[] args) {
        PhonesDemo Apple = new PhonesDemo();
        PhonesDemo Samsung = new PhonesDemo();
        PhonesDemo Xiaomi = new PhonesDemo("A406",299,32);
        PhonesDemo2 LG = new PhonesDemo2();
        PhonesDemo2 Nokia = new PhonesDemo2("Z10", 499, "White");
        PhonesDemo2 Motorolla = new PhonesDemo2("5566", 500);
        PhonesDemo3 Huawei = new PhonesDemo3();
        PhonesDemo3 Zoppo = new PhonesDemo3("Android Kitkat", "intel");
        PhonesDemo3 Nokia2 = new PhonesDemo3("Z15", 250, "Brown", "Android", "intel");
        Huawei.cpu = "intel";
        Huawei.systems = "Android lollipop";
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
        System.out.println(Huawei.cpu + " " + Huawei.systems);
        System.out.println(Nokia2.model + " " + Nokia2.price + " " + Nokia2.color + " " + Nokia2.cpu + " " + Nokia2.systems);
    }
}
