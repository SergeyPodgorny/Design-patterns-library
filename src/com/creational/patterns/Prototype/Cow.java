package com.creational.patterns.Prototype;

public class Cow implements Animal {

	private String animalId;
	

	public Cow(String animalId) {
		this.animalId = animalId;
	}

	@Override
	public void action() {
		System.out.println("Moo!");
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
	
	
	public String getAnimalId() {
		return animalId;
	}

	public void setAnimalId(String animalId) {
		this.animalId = animalId;
	}

}
