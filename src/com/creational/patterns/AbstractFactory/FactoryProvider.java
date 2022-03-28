package com.creational.patterns.AbstractFactory;

public class FactoryProvider implements AbstractFactory {

	
	private String type;
	
		
	public FactoryProvider(String type) {
		this.type = type;
	}


	


	@Override
	public Object create(String type) {
		
		AnimalFactory animalFactory = new AnimalFactory();
		
		if (type.equalsIgnoreCase("Cat")) {
			
			
			
		}
		
		
		
		return null;
	}
	
	
	
	
	

}
