package com.creational.patterns.Prototype;

public class Cow extends Animal implements Cloneable {

	private String animalId;
	

	public Cow(String animalId) {
		this.animalId = animalId;
	}

	@Override
	public void action() {
		System.out.println("Moo!");
	}
	
	
	public String getAnimalId() {
		return animalId;
	}

	public void setAnimalId(String animalId) {
		this.animalId = animalId;
	}

}
