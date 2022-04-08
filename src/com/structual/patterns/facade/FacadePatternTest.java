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
	
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); 
	
	private final PrintStream originalOut = System.out;
	
	@Before
	void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	void restoreStreams() {
		System.setOut(originalOut);
	}
	
	
	@Test
	
	void checkWhatDogPrints() {
		
		FacadeImpl impl = new FacadeImpl();
		
		System.out.println("Bark!");
		
		assertEquals(outContent.toString(), "Bark!");
		
		
		
	}
	

}
