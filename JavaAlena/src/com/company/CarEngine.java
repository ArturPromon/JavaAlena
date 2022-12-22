package com.company;

public class CarEngine extends CarDemo {
    public String typefuel;
    public String sizeengine;

    CarEngine(String mark, String model, String color, int price, String typefuel, String sizeengine){
        super(mark,model,color,price);
        this.typefuel = typefuel;
        this.sizeengine = sizeengine;
    }
}
