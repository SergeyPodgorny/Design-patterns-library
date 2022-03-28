package com.creational.patterns.AbstractFactory;

public class Cow implements Animal {
	
	
	@Override
	public String getType() {
		return "Cat";
	}
	
	{
		System.out.println("Moo!");
	}

}
