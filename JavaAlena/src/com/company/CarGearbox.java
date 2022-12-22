package com.company;

public class CarGearbox extends CarEngine{
    String typeGear;

    CarGearbox(String mark, String model, String color,String typefuel, String sizeengine, String typeGear, int price){
        super(mark,model,color,price,typefuel,sizeengine);
        this.typeGear = typeGear;
    }
}
