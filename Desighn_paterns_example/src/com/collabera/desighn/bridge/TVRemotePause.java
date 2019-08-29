package com.collabera.desighn.bridge;

public class TVRemotePause extends RemoteButton
{

	public TVRemotePause(EntertainmentDevice newDev) 
	{
		super(newDev);
		
	}

	@Override
	public void buttonNinePressed() 
	{
		System.out.println("TV was paused");
		
	}

}
