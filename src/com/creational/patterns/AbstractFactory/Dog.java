package com.creational.patterns.AbstractFactory;

public class Dog implements Animal{
	
	@Override
	public String getType() {
		return "Dog";
	}
	

	@Override
	public void action() {
		System.out.println("Bark!");
	}
	
	
}
