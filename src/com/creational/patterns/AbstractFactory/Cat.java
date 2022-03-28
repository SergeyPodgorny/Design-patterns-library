package com.creational.patterns.AbstractFactory;

public class Cat implements Animal{
	
	@Override
	public String getType() {
		return "Cat";
	}

	@Override
	public void action() {
		System.out.println("Meow!");
	}
	
	
	
}
