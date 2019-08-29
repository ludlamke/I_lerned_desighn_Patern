package com.collabera.desighn.bridge;

public abstract class EntertainmentDevice 
{
	public int deviceState;
	public int maxSetting;
	public int volumeSetting = 0;
	
	public abstract void buttonFivePressed();
	public abstract void buttonSixPressed();
	
	public void deviceFeedback()
	{
		if(deviceState > maxSetting || deviceState < 0)
		{
			deviceState = 0;
		}
		
		System.out.println("on " + deviceState);		
	}
	
	public void buttonSevenPressed()
	{
		volumeSetting--;
		
		System.out.println("volum at " + volumeSetting);
	}
	
}
