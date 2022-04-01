package com.creational.patterns.Builder;

public class Dog {
	
	
	
	
	
	public Dog(DogBuilder dogBuilder) {
		// TODO Auto-generated constructor stub
	}




	
	static class DogBuilder{
		
		private String name;
		private int age;
		private String owner;
				
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


		public DogBuilder(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		
		public DogBuilder ownerName(String owner) {
			this.owner = owner;
			return this;
		}
		
		public Dog build() {
			return new Dog(this);
		}
		
		
	}
	
	
	
	

}
