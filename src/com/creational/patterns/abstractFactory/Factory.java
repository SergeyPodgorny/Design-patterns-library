package com.creational.patterns.abstractFactory;



public class Factory {

	
	public Animal createInstance(String animalType) {
		
			
		if(animalType.equalsIgnoreCase("Cow")) {
			
			return new Cow();
		
		} else if(animalType.equalsIgnoreCase("Dog")) {
			
			return new Dog();
						
		} else if(animalType.equalsIgnoreCase("Cat")) {
			
			return new Cat();
			
		} else {
						
			return null;
		}
		
		
		
	}
	
	
	
	
}
