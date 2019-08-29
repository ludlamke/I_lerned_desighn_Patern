package com.collabera.desighn.deco;

public class Mozzarella extends ToppingDecorator
{

	public Mozzarella(Pizza newPizza) 
	{
		super(newPizza);
		
		System.out.println("add dough");
		
		System.out.println("add moz");
	}
	
	@Override
	public String getDescription() 
	{
		
		return tempPizza.getDescription() + ", Mozzarlla";
	}

	@Override
	public double getCost() 
	{
		
		return tempPizza.getCost() + .50;
	}

}
