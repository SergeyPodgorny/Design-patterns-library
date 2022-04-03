package com.creational.patterns.PrototypeWithCloneable;

import java.util.HashMap;

public class ObjectSilo {
	
	
	private static HashMap<String, Animal> silo = new HashMap<>();
	
		
	public static void loadLocalSilo() {
		
		Dog dog1 = new Dog("1");
		
		silo.put(dog1.getAnimalId(), dog1);
		
		Cat cat1 = new Cat("2");
		
		silo.put(cat1.getAnimalId(), cat1);
		
		Cow cow1 = new Cow("3");
		
		silo.put(cow1.getAnimalId(), cow1);
		
	}
	
	public static Animal cloneAnimal(String id) {
		
		Animal animal = silo.get(id);
		
		return animal.clone();
		
	}
	
	
	

}
