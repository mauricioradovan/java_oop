package com.mradovan.oop;

public class oop{
    public static void main(String[] args){
        System.out.println("Enter choice:");        
        System.out.println("1. Inheritance");
        String input = System.console().readLine();
        switch (input){
            case "1":                
                System.out.println("Option 1 selected.");
                MammalClass mammal = new MammalClass();
                mammal.getProperties();
                Reptile reptile = new Reptile();
                reptile.getProperties();                
                // arbitrary comment
            break;
            default:
                System.out.println("Undefined option selected. terminating...");
        }
    }
}
