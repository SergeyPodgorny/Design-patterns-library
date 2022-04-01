package com.creational.patterns.Builder;

public class Dog {
	
	
	private String name;
	private int age;
	private String owner;
	
	
	
	private Dog(String name, int age, String owner) {
		this.name = name;
		this.age = age;
		this.owner = owner;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getOwner() {
		return owner;
	}



	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	static class DogBuilder{
		
		private String name;
		private int age;
		private String owner;
		
		
		
		public DogBuilder(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		
		public DogBuilder withOwnerName(String owner) {
			this.owner = owner;
			return this;
		}
		
		public Dog build() {
			return new Dog(name, age, owner);
		}
		
		
	}
	
	
	
	

}
