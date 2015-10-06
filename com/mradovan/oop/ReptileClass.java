package com.mradovan.oop;

public class ReptileClass extends AnimalClass implements Reptile{
    public ReptileClass(){
    	super();
        System.out.println("Reptile: has cold blood.");
    }
    @Override
	public void getProperties(){
        super.getProperties();
        System.out.println("Has cold blood.");
    }
}
