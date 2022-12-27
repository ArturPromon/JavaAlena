package com.company;

public class CarNestedDemo {
    public String mark;
    public String model;

    CarNestedDemo(String mark, String model){
        this.mark = mark;
        this.model = model;
    }
}
class window{
    public static void print(){
        System.out.println("This is a window");
    }
    window(){

    }
}

class wheels{
    int R;
}

class door{
    class window{

    }
}
