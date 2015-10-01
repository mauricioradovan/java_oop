package com.mradovan.oop;

public class BirdClass extends AnimalClass{
    public BirdClass(){
        System.out.println("Bird costructor triggered.");
    }
    public void getProperties(){
        super.getProperties();
        System.out.println("Lays eggs");
    }
}
