package com.mradovan.oop;

public class BirdClass extends AnimalClass implements Bird{
    public BirdClass(){
        System.out.println("Bird costructor triggered.");
    }
    @Override
	public void getProperties(){
        super.getProperties();
        System.out.println("Lays eggs");
    }
}
