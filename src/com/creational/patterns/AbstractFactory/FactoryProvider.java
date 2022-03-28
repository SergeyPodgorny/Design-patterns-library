package com.creational.patterns.AbstractFactory;

public class FactoryProvider implements AbstractFactory {

	
	private String type;
	
		
	public FactoryProvider(String type) {
		this.type = type;
	}

	
	
	

	@Override
	public Object create(String type) {
		
		
		
		if (type.equalsIgnoreCase("Cat")) {
			
			return new AnimalFactory("Cat").create("Cat");
			
		} else if (type.equalsIgnoreCase("Dog")) {
			
			return new AnimalFactory("Dog").create("Dog");
			
		} else if (type.equalsIgnoreCase("Cow")) {
			
			return new AnimalFactory("Cow").create("Cow");
			
		} else {
			throw new AnimalNotFoundException("Animal not found");
		}
		
	}
	
	
	
	
	

}
