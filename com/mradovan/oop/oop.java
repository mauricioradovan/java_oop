package com.mradovan.oop;

public class oop{
    public static void main(String[] args){
    	if(args.length == 0){
    		System.out.println("No parameters detected. Please re-enter and choose one of the following:");        
    		System.out.println("1. Inheritance");
    	}
    	else{        
	        switch (args[0]){
	            case "1":                
	                System.out.println("Option 1 selected: Inheritance.");
	                 
	            break;
	            default:
	                System.out.println("Undefined option selected. terminating...");
	        }
    	}
    }
}
