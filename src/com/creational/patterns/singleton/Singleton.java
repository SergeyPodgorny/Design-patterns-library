package com.creational.patterns.singleton;

import com.exceptions.SingletonOverrideException;

public class Singleton {
	
	
	private static Singleton INSTANCE;
	
	
	
	private char someLetter;
	
	
	
	
	
	private Singleton() {
		
		
	}
	
	
	private Singleton(char someLetter) {
		this.someLetter = someLetter; 
		
		System.out.println(someLetter);
	}
	
	
	
	
	public static Singleton getInstance(char someLetter) {
		
		if (INSTANCE == null) {
			INSTANCE =  new Singleton(someLetter);
			return INSTANCE;
		} 	else {
			throw new SingletonOverrideException("Somebody tried to override the Singleton object");
		}
			
		
	}
	
	
	
	
	
	
	
	

}
