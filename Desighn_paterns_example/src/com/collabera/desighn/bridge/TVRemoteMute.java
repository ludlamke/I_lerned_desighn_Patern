package com.collabera.desighn.bridge;

public class TVRemoteMute extends RemoteButton
{

	public TVRemoteMute(EntertainmentDevice newDev) 
	{
		super(newDev);
		
	}

	@Override
	public void buttonNinePressed() 
	{
		System.out.println("TV was Muted");
	}

}
