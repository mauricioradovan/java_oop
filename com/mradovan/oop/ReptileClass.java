package com.mradovan.oop;

public class ReptileClass extends AnimalClass implements Reptile{
    public ReptileClass(){
        System.out.println("Reptile constructor triggered.");
    }
    @Override
	public void getProperties(){
        super.getProperties();
        System.out.println("Has cold blood.");
    }
}
