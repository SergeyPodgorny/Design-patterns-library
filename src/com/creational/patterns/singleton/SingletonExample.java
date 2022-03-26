package com.creational.patterns.singleton;

import com.exceptions.SingletonOverrideException;

public class SingletonExample {
	
	
	private static SingletonExample INSTANCE;
	
	
	
	private char someLetter;
	
	
	
	
	
	private SingletonExample() {
		
		
	}
	
	
	private SingletonExample(char someLetter) {
		this.someLetter = someLetter; 
		
		System.out.println(someLetter);
	}
	
	
	
	
	public static SingletonExample getInstance(char someLetter) {
		
		if (INSTANCE == null) {
			INSTANCE =  new SingletonExample(someLetter);
			return INSTANCE;
		} 	else {
			throw new SingletonOverrideException("Somebody tried to override the Singleton object");
		}
			
		
	}
	
	
	
	
	
	
	
	

}
