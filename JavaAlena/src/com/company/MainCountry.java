package com.company;

public class MainCountry {
    public static void main(String[] args) {
        CountryInterface country1 = new CountryResolve("Estonia");
        CountryInterface country2 = new CountryResolve("Latvia");
        country1.printCapital("Tallinn");
        country2.printCapital("Riga");
    }
}
