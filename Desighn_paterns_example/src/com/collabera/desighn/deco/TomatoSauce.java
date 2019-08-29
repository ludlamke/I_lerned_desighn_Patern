package com.collabera.desighn.deco;

public class TomatoSauce extends ToppingDecorator
{

	public TomatoSauce(Pizza newPizza) 
	{
		super(newPizza);
		
		
		System.out.println("add suz");
	}

	@Override
	public String getDescription() 
	{
		
		return tempPizza.getDescription() + ", suz";
	}

	@Override
	public double getCost() 
	{
		
		return tempPizza.getCost() + .35;
	}

}
