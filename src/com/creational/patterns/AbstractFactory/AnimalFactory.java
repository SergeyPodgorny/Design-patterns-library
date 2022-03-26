package com.creational.patterns.AbstractFactory;

public class AnimalFactory implements AbstractFactory {
	
	
	@Override
	public Animal create(String type) {
		if() {
			return new Cow();
		}
		
		return null;
	}
	
}
