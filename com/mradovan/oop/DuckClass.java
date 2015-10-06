package com.mradovan.oop;

public class DuckClass extends BirdClass implements Duck {
    public DuckClass(){
    	super();
        System.out.println("Duck: quacks and acts in Warner Bross cartoons.");
    }

	@Override
	public void getProperties() {
		super.getProperties();
		System.out.println("Duck: Quacks and acts in Warner Bross cartoons");
	}

}
