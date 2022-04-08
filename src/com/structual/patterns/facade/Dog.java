package com.structual.patterns.facade;

public class Dog implements Facade{

	
	@Override
	public void animalAction() {
		System.out.println("Bark!");
	}
	
}
