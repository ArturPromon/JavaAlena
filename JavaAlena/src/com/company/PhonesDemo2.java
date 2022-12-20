package com.company;

public class PhonesDemo2 {
    public int price;
    public String model;
    public int memory;
    public String color;

    PhonesDemo2(){

    }

    PhonesDemo2(String model, int price, String color){
        this.model = model;
        this.price = price;
        this.color = color;
    }
    PhonesDemo2(String model, int price){
        this.model = model;
        this.price = price;
    }

    PhonesDemo2(String model){
        this.model = model;
    }
}
