package com.creational.patterns.AbstractFactory;

public class AnimalFactory implements AbstractFactory {
	
	
	private String type;
	
	
	
	public AnimalFactory(String type) {
		this.type = type;
	}


	@Override
	public Animal create() {
		if(type.equalsIgnoreCase("Cow")) {
			return new Cow();
		} else if(type.equalsIgnoreCase("Cat")){
			return new Cat();
		} else if(type.equalsIgnoreCase("Dog")){
			return new Dog();
		} else {
			throw new AnimalNotFoundException("Animal not found");
		}
	}
	
}
