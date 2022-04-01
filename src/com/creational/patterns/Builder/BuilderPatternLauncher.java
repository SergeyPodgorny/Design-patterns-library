package com.creational.patterns.Builder;

public class BuilderPatternLauncher {
	
	public static void main(String[] args) {
		
			Dog dog = new Dog.DogBuilder("Sharick", 5).withOwnerName("Sergey").build();
			
			
			System.out.println(dog.getAge()+ " " +dog.getName()+" "+ dog.getOwner());
			
			
			Dog dog1 = new Dog.DogBuilder("Sharick", 5).build();
			
			
			System.out.println(dog1.getAge()+ " " +dog1.getName()+" "+ dog1.getOwner());
			
	}
	

}
