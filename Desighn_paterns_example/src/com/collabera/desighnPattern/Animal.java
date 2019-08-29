package com.collabera.desighnPattern;

public class Animal {
	private String name;
	//private double height;
	private int weight;
	private String sound;
	
	public Flys flyingType;
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}

	public void setWeight(int newWeight) 
	{
		if(newWeight > 0)
		{
			weight = newWeight;
		}
		else
		{
			System.out.println("go away");
		}
		
	}

	public int getWeight() 
	{
		return weight;
	}
	
	public void setSound(String newSound) 
	{
		sound = newSound;
	}
	
	public String getSound() 
	{
		return sound;
	}

	
	
	public String tryToFly()
	{
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys newFlyType)
	{
		flyingType = newFlyType;
	}
	
}
