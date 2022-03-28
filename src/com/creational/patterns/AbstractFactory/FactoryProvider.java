package com.creational.patterns.AbstractFactory;

public class FactoryProvider implements AbstractFactory {

	
	private String type;
	
		
	public FactoryProvider(String type) {
		this.type = type;
	}

	
	
	

	@Override
	public Object create() {
		
		
		
		if (type.equalsIgnoreCase("Cat")) {
			
			return new AnimalFactory("Cat").create();
			
		} else if (type.equalsIgnoreCase("Dog")) {
			
			return new AnimalFactory("Dog").create();
			
		} else if (type.equalsIgnoreCase("Cow")) {
			
			return new AnimalFactory("Cow").create();
			
		} else {
			throw new AnimalNotFoundException("Animal not found");
		}
		
	}
	
	
	
	
	

}
