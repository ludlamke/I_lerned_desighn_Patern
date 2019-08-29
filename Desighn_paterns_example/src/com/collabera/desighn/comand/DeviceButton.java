package com.collabera.desighn.comand;

public class DeviceButton 
{
	Command theC;
	
	public DeviceButton(Command newC)
	{
		theC = newC;
	}
	
	public void press()
	{
		theC.execute();
	}
	
	public void pressundo()
	{
		theC.undo();
	}
}
