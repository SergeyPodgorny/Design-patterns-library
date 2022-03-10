package com.singleton;

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
			return new SingletonExample(someLetter);
		} 		
		
		
		return INSTANCE;
	}
	
	
	
	
	
	
	
	

}
