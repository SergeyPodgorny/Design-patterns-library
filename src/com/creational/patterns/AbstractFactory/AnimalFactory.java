package com.creational.patterns.AbstractFactory;

public class AnimalFactory implements AbstractFactory {
	
	
	
	
	
	
	@Override
	public Animal create(String type) {
		if(type.equalsIgnoreCase("Cow")) {
			return new Cow();
		} else if(type.equalsIgnoreCase("Cat")){
			return new Cat();
		} else if(type.equalsIgnoreCase("Dog")){
			return new Dog();
		} 
		
		else {
			throw new AnimalNotFoundException("Animal not found");
		}
	}
	
}