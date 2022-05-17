package com.creational.patterns.singleton;

public class LightWeightThreadSafeSingleton {
	
	
	private static  LightWeightThreadSafeSingleton INSTANCE;
	
	
	
	private LightWeightThreadSafeSingleton() {
		{
			System.out.println("Light Weight Thread Safe Singleton deployed");
		}
	}
	
	
	public static LightWeightThreadSafeSingleton getInstance() {
		
		if(INSTANCE == null) {
			synchronized(LightWeightThreadSafeSingleton.class) {
				if(INSTANCE ==null) {
					INSTANCE = new LightWeightThreadSafeSingleton();
					return INSTANCE;
				}
			}
		}
				
		return INSTANCE;
	}

}
