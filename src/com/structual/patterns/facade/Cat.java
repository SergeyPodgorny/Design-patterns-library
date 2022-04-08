package com.structual.patterns.facade;

public class Cat implements Facade {

	
	@Override
	public void animalAction() {
		System.out.println("Meow!");
	}
	
}
