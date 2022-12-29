package com.company;

public class CountryResolve implements CountryInterface {
    String country;

    CountryResolve(String country){
        this.country = country;
    }
    @Override
    public void printCapital(String city) {
        String capital = city;
        System.out.println("The capital of " + country + " is " + capital);
    }
}
