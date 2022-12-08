package com.company;

import java.io.File;
import java.io.PrintWriter;

public class Writer {
    public static void main(String[] args) {
        try{
            File file = new File("src/com/company/test.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello World");
            pw.print("Happy new year");
            pw.print(" " + "2022");
            pw.close();
        }catch (Exception e){
            System.out.println("Some error: " + e);
        }
    }
}
