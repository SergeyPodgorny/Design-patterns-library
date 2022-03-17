package com.creational.patterns.abstractFactory;



public class FactoryStartUp {

	public static void main(String[] args) {
		
		
		Factory factory = new Factory();
		
		factory.createInstance("Cat").action();
		
		factory.createInstance(null).action();
		
		factory.createInstance("Dog").action();
		
		factory.createInstance("Cow").action();
		

	}

}
