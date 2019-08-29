package com.collabera.desighn.comand;

public class TurnTVUp implements Command 
{

ElectronicDevice theD;
	
	public TurnTVUp(ElectronicDevice newD)
	{
		theD = newD;
	}
	@Override
	public void execute() 
	{
		theD.volUp();

	}
	
	@Override
	public void undo() 
	{
		
		theD.volDown();
	}

}
