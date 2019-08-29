package com.collabera.desighnPattern;

public class Dog extends Animal {
	
	 Dog()
	{
		super();
		
		setSound("bark");
		
		flyingType = new NoFlys();
	}
	 
	public void digHole()
	{
		System.out.println("dig a houl");
	}
	
	public void ChangVar(int input)
	{
		input = 420;
		
		System.out.println("rand num is: "+ input);
	}
}
