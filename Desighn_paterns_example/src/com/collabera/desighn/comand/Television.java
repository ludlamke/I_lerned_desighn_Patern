package com.collabera.desighn.comand;

public class Television implements ElectronicDevice 
{

	private int volume = 0;
	
	@Override
	public void on() 
	{
		
		System.out.println("TV is ON");

	}

	@Override
	public void off() 
	{
		System.out.println("TV is OFF");

	}

	@Override
	public void volUp() 
	{
		volume++;
		System.out.println("volume at " + volume);

	}

	@Override
	public void volDown() 
	{
		volume--;
		System.out.println("volume at " + volume);

	}

}
