package com.creational.patterns.abstractFactory;

import com.exceptions.NullAnimalInFactory;

public class FactoryStartUp {

	public static void main(String[] args) {
		
		
		Factory factory = new Factory();
		
		try {
			factory.createInstance("Cat").action();
			
			factory.createInstance(null).action();
			
			factory.createInstance("Dog").action();
			
			factory.createInstance("Cow").action();
		} catch (NullAnimalInFactory e) {
			System.out.println(e.getMessage());
		} 
		

	}

}
