package com.creational.patterns.singleton;

public class Launcher {
	
	
	public static void main(String[] args) {
		
		
		Runnable r1 = () -> {
			ThreadSafeSingleton.getInstance();
		};
		
		
		
		new Thread(r1).start();
		new Thread(r1).start();
		
		
		
		Runnable r2 = () ->{
			LightWeightThreadSafeSingleton.getInstance();
		};
		
		new Thread(r2).start();
		new Thread(r2).start();
		
		
	}

}
