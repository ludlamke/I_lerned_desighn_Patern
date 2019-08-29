package com.collabera.desighn.comand;

import java.util.List;
public class TrunItAllOff implements Command 
{
	List<ElectronicDevice> theD;
	
	public TrunItAllOff(List<ElectronicDevice> newD) 
	{
		theD = newD;
	}
	
	@Override
	public void execute() 
	{
		for(ElectronicDevice device : theD)
		{
			device.off();
		}

	}

	@Override
	public void undo() 
	{
		for(ElectronicDevice device : theD)
		{
			device.on();
		}
		
	}
	

}
