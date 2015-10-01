package com.mradovan.oop;

public class ReptileClass extends AnimalClass{
    public ReptileClass(){
        System.out.println("Reptile constructor triggered.");
    }
    public void getProperties(){
        super.getProperties();
        System.out.println("Has cold blood.");
    }
}
