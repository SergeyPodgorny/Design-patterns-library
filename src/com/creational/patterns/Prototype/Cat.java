package com.creational.patterns.Prototype;

public class Cat implements Animal {

	private String animalId;

	
	public Cat(String animalId) {
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
		System.out.println("Meow!");
	}

	public String getAnimalId() {
		return animalId;
	}

	public void setAnimalId(String animalId) {
		this.animalId = animalId;
	}
	
	
	
	

	

}
