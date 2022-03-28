package com.creational.patterns.AbstractFactory;

public class FactoryProvider implements AbstractFactory {

	
	private String type;
	
		
	public FactoryProvider(String type) {
		this.type = type;
	}

	AnimalFactory animalFactory = new AnimalFactory();
	
	

	@Override
	public Object create(String type) {
		
		
		
		if (type.equalsIgnoreCase("Cat")) {
			
			animalFactory.create("Cat");
			
		} else if (type.equalsIgnoreCase("Dog")) {
			animalFactory.create("Dog");
			
		} else if (type.equalsIgnoreCase("Cow")) {
			animalFactory.create("Cow");
			
		} throw new AnimalNotFoundException("");
		
	}
	
	
	
	
	

}
