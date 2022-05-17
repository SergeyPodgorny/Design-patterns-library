package com.creational.patterns.singleton;

public class ThreadSafeSingleton {
	
	
	private static ThreadSafeSingleton INSTANCE;

	private ThreadSafeSingleton() {
		{
			System.out.println("thread safe singleton deployed");
		}
	}
	
	
	
	public static synchronized void getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ThreadSafeSingleton();
			
		 
		}
		
	}
	

}
