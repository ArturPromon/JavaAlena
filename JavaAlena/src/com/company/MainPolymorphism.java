package com.company;

public class MainPolymorphism {
    public static void main(String[] args) {
        FigurePolymorphism figure1 = new Ellipse();
        figure1.draw();
        FigurePolymorphism figure2 = new Triangle();
        figure2.draw();
        FigurePolymorphism figure3 = new Square();
        figure3.draw();

        FigurePolymorphism[] arrayFigure = new FigurePolymorphism[]{new Square(), new Triangle(), new Ellipse()};

        for(int i = 0; i < arrayFigure.length;i++){
            arrayFigure[i].draw();
        }
    }



}
