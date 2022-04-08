package com.structual.patterns.proxy;

public class ProxyObject implements Proxy {

	
	
	private RealObject realObject;
	
	private String message;
		
	public ProxyObject(String message) {
		this.message = message;
	}


	@Override
	public void writeToConsole() {
		if (realObject ==null) {
			realObject = new RealObject(message);
		}
	
	realObject.writeToConsole();
	}
	
	
	
}
