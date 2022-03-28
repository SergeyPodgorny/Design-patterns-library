package com.creational.patterns.AbstractFactory;

public class Cow implements Animal {
	
	
	@Override
	public String getType() {
		return "Cat";
	}
	
	@Override
	public void action() {
		System.out.println("Moo!");
	}

}
