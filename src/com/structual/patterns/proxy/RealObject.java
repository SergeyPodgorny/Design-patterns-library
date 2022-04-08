package com.structual.patterns.proxy;

public class RealObject implements Proxy{
	
	
	
	private String message;
	
	
	
	 public RealObject(String message) {
		this.message = message;
		System.out.println("RealObject constructed");
		
	}

	@Override
	public void writeToConsole() {
		System.out.println(message);
	}
	
	

}
