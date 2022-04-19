package com.behavioral.patterns.strategy;

public class DogInRuntime {

	public static void main(String[] args) {
		
		
		
		AnimalAction bark = () -> {
			
				System.out.println("Bark!");
			
			
		};
			
		new Dog(bark).getAnimalAction().action();
			
			
			
		AnimalAction woof = () -> {
			System.out.println("Woof!");
		};
			
	
		new Dog(woof).getAnimalAction().action();
	
		
		
		
	}

}
