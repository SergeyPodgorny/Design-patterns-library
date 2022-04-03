package com.creational.patterns.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.creational.patterns.PrototypeWithCloneable.Animal;
import com.creational.patterns.PrototypeWithCloneable.Cat;
import com.creational.patterns.PrototypeWithCloneable.Cow;
import com.creational.patterns.PrototypeWithCloneable.Dog;
import com.creational.patterns.PrototypeWithCloneable.ObjectSilo;

public class PrototypePatternTest {
	
	
	
	@Test
	public void doesPrototypePatternShallowCopyWorks() {
		
		
		//testing dog 
		
		ObjectSilo.loadLocalSilo();
		
		Animal dog1 = new Dog("1");
				
		ObjectSilo.cloneAnimal("1");
		
		assertEquals(ObjectSilo.cloneAnimal("1"), dog1);
		
		
		// testing cat
		
		Animal cat1 = new Cat("2");
		
		ObjectSilo.cloneAnimal("2");
		
		assertEquals(ObjectSilo.cloneAnimal("2"), cat1);
		
		
		//testing cow
		
		Animal cow1 = new Cow("3");
		
		ObjectSilo.cloneAnimal("3");
		
		assertEquals(ObjectSilo.cloneAnimal("3"), cow1);
		
		
		
	}
	

}
