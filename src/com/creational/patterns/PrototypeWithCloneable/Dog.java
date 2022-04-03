package com.creational.patterns.PrototypeWithCloneable;

import java.util.Objects;

public class Dog extends Animal implements Cloneable{

	private String animalId;

	
	public Dog(String animalId) {
		this.animalId = animalId;
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
		Dog other = (Dog) obj;
		return Objects.equals(animalId, other.animalId);
	}
	
	
}
