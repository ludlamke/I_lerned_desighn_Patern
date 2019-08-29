package com.collabera.desighn.comand;

public class TurnTVOff implements Command {

	ElectronicDevice theD;
	
	public TurnTVOff(ElectronicDevice newD)
	{
		theD = newD;
	}
	@Override
	public void execute() 
	{
		
         theD.off();
	}
	@Override
	public void undo() 
	{
		
		theD.on();
	}

}
