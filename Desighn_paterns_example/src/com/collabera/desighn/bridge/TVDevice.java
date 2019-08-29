package com.collabera.desighn.bridge;

public class TVDevice extends EntertainmentDevice
{
	public TVDevice(int newDevice, int newMax) 
	{
		deviceState = newDevice;
		maxSetting = newMax;
	}

	@Override
	public void buttonFivePressed() 
	{
		
		System.out.println("Channel Down");
		
		deviceState--;
	}

	@Override
	public void buttonSixPressed() 
	{
		System.out.println("channel down");
		
		deviceState++;
	}

}
