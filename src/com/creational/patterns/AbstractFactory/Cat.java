package com.creational.patterns.AbstractFactory;

public class Cat implements Animal{
	
	@Override
	public String getType() {
		return "Cat";
	}

	{
		System.out.println("Meow!");
	}
	
	
	
}
