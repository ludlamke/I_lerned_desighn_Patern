package com.collabera.desighn.bridge;

public class TestTheRemote {

	public static void main(String[] args) 
	{
		RemoteButton TV = new TVRemoteMute(new TVDevice(1, 200));
		
		RemoteButton TV2 = new TVRemotePause(new TVDevice(1, 200));
		
		System.out.println("test");
		
		TV.buttonFivePress();
		TV.buttonSixPressed();
		TV.buttonNinePressed();
		
		TV2.buttonFivePress();
		TV2.buttonSixPressed();
		TV2.buttonSixPressed();
		TV2.buttonSixPressed();
		TV2.buttonSixPressed();
		TV2.buttonNinePressed();
		TV2.devFeadback();

	}

}
