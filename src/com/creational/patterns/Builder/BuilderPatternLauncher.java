package com.creational.patterns.Builder;

public class BuilderPatternLauncher {
	
	public static void main(String[] args) {
		
			Dog dog = new Dog.DogBuilder("Sharick", 5).withOwnerName("Sergey").build();
			
			
			System.out.println(dog.getAge()+ " " +dog.getName()+" "+ dog.getOwner());
			
	}
	

}
