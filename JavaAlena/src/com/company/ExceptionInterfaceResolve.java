package com.company;

public class ExceptionInterfaceResolve implements ExceptionInterface{
    @Override
    public float math(int num1, int num2) {
        return num1/num2;
    }

    public void say(){
        System.out.println("Hello");
    }
}
