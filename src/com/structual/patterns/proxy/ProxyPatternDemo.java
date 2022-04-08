package com.structual.patterns.proxy;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		
		
		
		ProxyObject someObject = new ProxyObject("a message from proxy"); 
		
		
		someObject.writeToConsole();

		System.out.println(" ");
		
		someObject.writeToConsole();
		
	}

}
