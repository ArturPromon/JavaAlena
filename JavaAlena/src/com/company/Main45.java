package com.company;
enum levels{
    Low,
    Medium,
    Hard
}

public class Main45 {
    public static void main(String[] args) {
        levels var = levels.Hard;
        switch(var){
            case Low:
                System.out.println("Level is Low");
                break;
            case Medium:
                System.out.println("Level is Medium");
                break;
            case Hard:
                System.out.println("Level is Hard");
                break;
        }
    }
}
