package com.company;

public class Car {
    public static void main(String[] args) {
        CarGearbox car1 = new CarGearbox("Audi", "A6", "Black", "Diesel","2.5", "Variator", 7000);
        System.out.println(car1.mark + " " + car1.model + " " + car1.color + " " + car1.typefuel+ " " +car1.sizeengine + " " + car1.typeGear+ " " + car1.price );
    }
}
