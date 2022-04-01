package com.creational.patterns.Builder;

public class BuilderPatternLauncher {
	
	public static void main(String[] args) {
		
			Dog dog = new Dog.DogBuilder("Sharick", 5).ownerName("Sergey").build();
			
			
			System.out.println();
			
	}
	

}
