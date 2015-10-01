package com.mradovan.oop;

public class MammalClass extends AnimalClass implements Mammal{
    public MammalClass(){
        System.out.println("Mammal costructor triggered.");
    }
    @Override
	public void getProperties(){
        super.getProperties();
        System.out.println("Gives birth to live children");
    }
}
