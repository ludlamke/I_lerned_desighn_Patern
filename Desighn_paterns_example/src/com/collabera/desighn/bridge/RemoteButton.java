package com.collabera.desighn.bridge;

public abstract class RemoteButton 
{
	private EntertainmentDevice theDev;
	
	public RemoteButton(EntertainmentDevice newDev)
	{
		theDev = newDev;
	}
	
	public void buttonFivePress()
	{
		theDev.buttonFivePressed();
	}
	
	public void buttonSixPressed()
	{
		theDev.buttonSixPressed();
	}
	
	public void devFeadback()
	{
		theDev.deviceFeedback();
	}
	
	public abstract void buttonNinePressed();
}
