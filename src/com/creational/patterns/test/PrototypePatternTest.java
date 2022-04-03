package com.creational.patterns.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.creational.patterns.Prototype.Animal;
import com.creational.patterns.Prototype.Cat;
import com.creational.patterns.Prototype.Cow;
import com.creational.patterns.Prototype.Dog;
import com.creational.patterns.Prototype.ObjectSilo;

public class PrototypePatternTest {
	
	
	
	@Test
	public void doesPrototypePatternShallowCopyWorks() {
		
		
		//testing dog 
		
		ObjectSilo.loadLocalSilo();
		
		Dog dog1 = new Dog("1");
				
		ObjectSilo.cloneAnimal("1");
		
		assertEquals(ObjectSilo.cloneAnimal("1"), dog1);
		
		
		// testing cat
		
		Cat cat1 = new Cat("2");
		
		ObjectSilo.cloneAnimal("2");
		
		assertEquals(ObjectSilo.cloneAnimal("2"), cat1);
		
		
		//testing cow
		
		Cow cow1 = new Cow("3");
		
		ObjectSilo.cloneAnimal("3");
		
		assertEquals(ObjectSilo.cloneAnimal("3"), cow1);
		
		
		
	}
	

}
