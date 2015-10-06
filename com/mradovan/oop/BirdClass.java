package com.mradovan.oop;

public class BirdClass extends AnimalClass implements Bird{
    public BirdClass(){
    	super();
        System.out.println("Bird: can (generally) fly and lays eggs.");
    }
    @Override
	public void getProperties(){
        super.getProperties();
        System.out.println("Bird: can (generally) fly and lays eggs.");
    }
}
