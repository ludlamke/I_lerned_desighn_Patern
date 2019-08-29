package com.collabera.desighn.comand;

public class TurnTVOn implements Command {

	ElectronicDevice theD;
	
	public TurnTVOn(ElectronicDevice newD)
	{
		theD = newD;
	}
	@Override
	public void execute() 
	{
		theD.on();
	}
	@Override
	public void undo() 
	{
		theD.off();
	}

}
