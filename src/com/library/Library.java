package com.library;

import com.creational.patterns.singleton.Singleton;

public class Library {

	public static void main(String[] args) {
		
		
				
		System.out.println(Singleton.getInstance('a').getClass());
		
		System.out.println(Singleton.getInstance('b').getClass());
		
	}

}
