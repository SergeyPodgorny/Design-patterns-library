package com.creational.patterns.abstractFactory;

import com.exceptions.NullAnimalInFactoryException;

public class FactoryStartUp {

	public static void main(String[] args) {
		
		
		Factory factory = new Factory();
		
		try {
			factory.createInstance("Cat").action();
			
			factory.createInstance(null).action();
			
			factory.createInstance("Dog").action();
			
			factory.createInstance("Cow").action();
		} catch (NullAnimalInFactoryException e) {
			
			System.out.println(e.getMessage());
			
		} 
		

	}

}
