package com.creational.patterns.abstractFactory;

import com.exceptions.NullAnimalInFactoryException;

public class Factory {

	
	public Animal createInstance(String animalType) {
		
			
		if(animalType == "Cow") {
			
			return new Cow();
		
		} else if(animalType == "Dog") {
			
			return new Dog();
						
		} else if(animalType == "Cat") {
			
			return new Cat();
			
		} else if(animalType == null){
			
			throw new NullAnimalInFactoryException("Somebody just put null into animal factory!");
			
		} else {
			
			return null;
		}
		
		
		
		
		
		
		
		
	
		
		
		
	}
	
	
	
	
}
