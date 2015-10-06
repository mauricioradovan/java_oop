package com.mradovan.oop;

public class oop{
    public static void main(String[] args){
    	if(args.length == 0){
    		System.out.println("No parameters detected. Please re-enter and choose one of the following:");        
    		System.out.println("1. Inheritance");
    		System.out.println("2. Polymorphism");
    	}
    	else{        
	        switch (args[0]){
	            case "1":                
	                System.out.println("Option 1 selected: Inheritance.");
	                Duck duck = new DuckClass();
	                duck.getProperties();
	            break;
	            case "2":
	            	System.out.println("Option 2 selected: polymorphism.");
	            	Animal animal;
	            	System.out.println("\nCreating an Animal class:");
	            	animal = new AnimalClass();
	            	System.out.println("\nCreating a Bird class:");
	            	animal = new BirdClass();
	            	System.out.println("\nCreating a Duck class:");
	            	animal = new DuckClass();
	            break;
	            default:
	                System.out.println("Undefined option selected. terminating...");
	        }
    	}
    }
}
