package com.creational.patterns.PrototypeWithCloneable;

import java.util.Objects;

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
		Cow other = (Cow) obj;
		return Objects.equals(animalId, other.animalId);
	}
	
	
	

}
