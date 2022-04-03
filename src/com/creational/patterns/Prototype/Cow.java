package com.creational.patterns.Prototype;

public class Cow extends Animal {

	public String name;
	
	public String ownerName;
	
	public int age;

	public Cow(String name, String ownerName, int age) {
		this.name = name;
		this.ownerName = ownerName;
		this.age = age;
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

	

	
	
	
	
	

}