package com.creational.patterns.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.creational.patterns.Prototype.Dog;
import com.creational.patterns.Prototype.ObjectSilo;

public class PrototypePatternTest {
	
	
	
	@Test
	public void doesPrototypePatternWorks() {
		
		
		Dog dog1 = new Dog("1");
		
		ObjectSilo.loadLocalSilo();
		
		ObjectSilo.cloneAnimal("1");
		
		assertEquals(ObjectSilo.cloneAnimal("1").getClass(), dog1.getClass());
		
		
	}
	

}
