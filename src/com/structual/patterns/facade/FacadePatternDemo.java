package com.structual.patterns.facade;

public class FacadePatternDemo {

	
	
	public static void main(String[] args) {
		
		FacadeImpl impl = new FacadeImpl();
		
		
		impl.catAction().animalAction();
		
		impl.cowAction().animalAction();
		
		impl.dogAction().animalAction();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
