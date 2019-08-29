package com.collabera.desighn.prto;

public class Sheep implements Animal {

	public Sheep()
	{
		System.out.println("I is Shep");
	}
	@Override
	public Animal makeCopy() 
	{
		System.out.println("shep poof exsitans");
		
		Sheep sepObj = null;
		
		try 
		{
			sepObj = (Sheep) super.clone();
		} 
		catch (CloneNotSupportedException e) 
		{
			
			e.printStackTrace();
		}
		
		return sepObj;
	}

}
