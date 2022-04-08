package com.structual.patterns.facade;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class FacadePatternTest {
	
	@Test
	void ifCreateDogThenFacadeShouldAlsoCreateDog() {
		
		Dog dog = new Dog();
		
		FacadeImpl impl = new FacadeImpl();
		
		assertEquals(dog.getClass(),impl.dogAction().getClass());
		
	}
	
	
	// testing what prints to console
	
	
	ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 
	
	private final PrintStream out = System.out;
	
	@Before
	void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	void restoreStreams() {
		System.setOut(out);
	}
	
	
	@Test
	
	void checkWhatDogPrints() {
		
		FacadeImpl impl = new FacadeImpl();
		
		impl.dogAction().animalAction();
		
		assertEquals("Bark!", outContent.toString());
		
		
		
	}
	

}
