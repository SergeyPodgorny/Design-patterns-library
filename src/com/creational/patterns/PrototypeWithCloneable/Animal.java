package com.creational.patterns.PrototypeWithCloneable;

public abstract class Animal {
	
	public abstract void action();
	
	@Override
	public Animal clone() {
		
		Animal clone = null;
		
		try {
			clone =(Animal) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
		
	}
	
	

}
