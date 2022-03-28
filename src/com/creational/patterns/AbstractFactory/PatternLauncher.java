package com.creational.patterns.AbstractFactory;

public class PatternLauncher {
	
	
	public static void main(String[] args) {
		
		
		FactoryProvider factory = new FactoryProvider("cat");
		
		factory.create(null);
		
	}
	

}
