package com.collabera.desighnPattern;

public class Bird extends Animal {

	public Bird()
	{
		super();
		
		setSound("tweet");
		
			flyingType = new ItFlys();
		
	}
	
	
}
