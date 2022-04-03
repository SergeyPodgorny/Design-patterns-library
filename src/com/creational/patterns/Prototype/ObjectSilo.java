package com.creational.patterns.Prototype;

import java.util.HashMap;

public class ObjectSilo {
	
	
	HashMap<String, Animal> silo = new HashMap<>();
	
	Dog dog1 = new Dog("Sharick","Sergey",3);
	
	Cat cat1 = new Cat("Barsick","Sergey",2);
	
	Cow cow1 = new Cow("Matilda","SomeFarmer",1);
	
	{
		silo.put("1", dog1);
		
		silo.put("2", cat1);
		
		silo.put("3", cow1);
	}
	
	
	
	
	

}
