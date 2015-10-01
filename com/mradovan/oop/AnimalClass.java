package com.mradovan.oop;

public class AnimalClass implements Animal{
    AnimalClass(){
        System.out.println("Animal constructor triggered.");
    }
    /* (non-Javadoc)
	 * @see com.mradovan.oop.Animal#getProperties()
	 */
    @Override
	public void getProperties(){
        System.out.println("Has eyes");
    }
}
