package com.mradovan.oop;

public class CrocodileClass implements Crocodile {
    public CrocodileClass(){
    	super();
        System.out.println("Crocodile: is big and long, and has sharp teeth.");
    }

	@Override
	public void getProperties() {
		System.out.println("Is big and long, and has sharp teeth.");		
	}

}
