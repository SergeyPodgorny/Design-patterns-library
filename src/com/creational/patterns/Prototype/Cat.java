package com.creational.patterns.Prototype;

import java.util.Objects;

public class Cat extends Animal implements Cloneable{

	private String animalId;

	
	public Cat(String animalId) {
		this.animalId = animalId;
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



	@Override
	public int hashCode() {
		return Objects.hash(animalId);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return Objects.equals(animalId, other.animalId);
	}
	
	
	
	

	

}
