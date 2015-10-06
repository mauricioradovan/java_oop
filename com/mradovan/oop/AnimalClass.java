package com.mradovan.oop;

public class AnimalClass implements Animal{
    AnimalClass(){
        System.out.println("Animal: can move and has eyes.");
    }
    @Override
	public void getProperties(){
    	System.out.println("Animal: can move and has eyes.");        
    }
}
