package com.mradovan.oop;

public class MammalClass extends AnimalClass{
    public MammalClass(){
        System.out.println("Mammal costructor triggered.");
    }
    public void getProperties(){
        super.getProperties();
        System.out.println("Gives birth to live children");
    }
}
