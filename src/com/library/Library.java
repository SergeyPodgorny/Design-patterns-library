package com.library;

import com.singleton.SingletonExample;

public class Library {

	public static void main(String[] args) {
		
		
				
		System.out.println(SingletonExample.getInstance('a').getClass());
		
		System.out.println(SingletonExample.getInstance('b').getClass());
		
	}

}
