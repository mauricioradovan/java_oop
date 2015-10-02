package com.mradovan.oop;

public class AnimalClass implements Animal{
    AnimalClass(){
        System.out.println("Animal constructor triggered.");
    }
    @Override
	public void getProperties(){
        System.out.println("Can move and has eyes");        
    }
}
