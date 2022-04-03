package com.creational.patterns.Prototype;

public class PatternLaucnher {
	
	
	
	public static void main (String[] args) {
		
		ObjectSilo.loadLocalSilo();
		
		ObjectSilo.cloneAnimal("1").action();
		
		
		
	}
	
	
	
	
	
	
	

}
