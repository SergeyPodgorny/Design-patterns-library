package com.creational.patterns.Prototype;

public class Cow implements Animal {

	public String name;
	
	public String ownerName;
	
	public int age;
	
	public String animalId;

	public Cow(String name, String ownerName, int age, String animalId) {
		this.name = name;
		this.ownerName = ownerName;
		this.age = age;
		this.animalId = animalId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAnimalId() {
		return animalId;
	}

	public void setAnimalId(String animalId) {
		this.animalId = animalId;
	}


}
