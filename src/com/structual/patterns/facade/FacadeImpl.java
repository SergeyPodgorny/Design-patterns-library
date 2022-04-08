package com.structual.patterns.facade;

public class FacadeImpl {
	
	
	private Facade dog;
	
	private Facade cat;
	
	private Facade cow;

	public FacadeImpl() {
		
		this.dog = new Dog();
		this.cat = new Cat();
		this.cow = new Cow();
		
	}
	
	
	
	

}
