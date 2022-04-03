package com.creational.patterns.Prototype;

public class Dog implements Animal {

	private String animalId;

	
	
	
	public Dog(String animalId) {
		this.animalId = animalId;
	}

	
	@Override
	public Animal clone() {
		
		Animal clone = null;
		
		try {
			clone =(Animal) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
		
	}
	
	
	
	
	@Override
	public void action() {
		System.out.println("Bark");
	}
	
	public String getAnimalId() {
		return animalId;
	}

	public void setAnimalId(String animalId) {
		this.animalId = animalId;
	}
	
	
}
