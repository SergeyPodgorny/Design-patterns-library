package com.creational.patterns.AbstractFactory;

public class PatternLauncher {
	
	
	public static void main(String[] args) {
		
		
		new FactoryProvider("trout").create();
		
		new FactoryProvider("cat").create();
		
		new FactoryProvider("octopus").create();
		
		
		
		
		
		
	}
	

}
