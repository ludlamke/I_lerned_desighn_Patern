package com.collabera.desighn.comand;

import java.util.ArrayList;
import java.util.List;
public class PlayWithRemote 
{
   public static void main(String[] args) 
   {
	ElectronicDevice newD = TVRemote.getDevice();
	
	TurnTVOn onCommand = new TurnTVOn(newD);
	
	DeviceButton onPressed = new DeviceButton(onCommand);
	
	onPressed.press();
	
	TurnTVOff offCommand = new TurnTVOff(newD);
	
	 onPressed = new DeviceButton(offCommand);
	
	onPressed.press();
	
	TurnTVUp upCommand = new TurnTVUp(newD);
	
	onPressed = new DeviceButton(upCommand);
	
	onPressed.press();
	onPressed.press();
	onPressed.press();
	onPressed.press();
	onPressed.press();
	
	Television theTV = new Television();
	
	Radio theRadio = new Radio();
	
	List<ElectronicDevice> allDev = new ArrayList<ElectronicDevice>();
	
	allDev.add(theTV);
	allDev.add(theRadio);
	
	TrunItAllOff trunAll = new TrunItAllOff(allDev);
	
	DeviceButton offAll = new DeviceButton(trunAll);
	
	offAll.press();
	
	offAll.pressundo();
   }
}
