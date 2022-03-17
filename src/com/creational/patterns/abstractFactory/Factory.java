package com.creational.patterns.abstractFactory;

public class Factory {

	
	public Animal createInstance(String animalType) {
		
			
		if(animalType == "Cow") {
			
			return new Cow();
		
		} else if(animalType == "Dog") {
			
			return new Dog();
						
		} else if(animalType == "Cat") {
			return new Cat();
		} else {
			
			return null;
		}
		
		
		
		
		
		
		
		
	
		
		
		
	}
	
	
	
	
}
