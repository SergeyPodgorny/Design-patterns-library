package com.behavioral.patterns.strategy;

public class Dog {

	
	private AnimalAction animalAction;

	public Dog(AnimalAction animalAction) {
		this.animalAction = animalAction;
	}

	public AnimalAction getAnimalAction() {
		return animalAction;
	}

	public void setAnimalAction(AnimalAction animalAction) {
		this.animalAction = animalAction;
	}
	
	
	
	{
		animalAction.action();
	}
	
	
}
