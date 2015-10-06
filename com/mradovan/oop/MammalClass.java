package com.mradovan.oop;

public class MammalClass extends AnimalClass implements Mammal{
    public MammalClass(){
    	super();
        System.out.println("Mammal: gives birth to live children.");
    }
    @Override
	public void getProperties(){
        super.getProperties();
        System.out.println("Gives birth to live children");
    }
}
