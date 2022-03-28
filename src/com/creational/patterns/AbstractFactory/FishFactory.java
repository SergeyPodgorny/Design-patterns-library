package com.creational.patterns.AbstractFactory;

public class FishFactory implements AbstractFactory{

	private String type;
	
	
	public FishFactory(String type) {
		this.type = type;
	}


	@Override
	public Object create() {
		
		if(type.equalsIgnoreCase("Thunnus")) {
			return new Thunnus();
		} else if (type.equalsIgnoreCase("Trout")) {
			return new Trout();
		} else {
			throw new FishNotFoundException("Fish not found");
		}
		
	}
	
	
	
	
	
	

}
