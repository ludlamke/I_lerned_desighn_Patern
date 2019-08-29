package com.collabera.desighn.buider;

public class TeastRoboBuilder {

	public static void main(String[] args) 
	{
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		RobotEngineer roborE = new RobotEngineer(oldStyleRobot);
		
		roborE.makeRobo();
		
		Robot firstRobot = roborE.getRobot();
		
		System.out.println(firstRobot.getroboHead());
		System.out.println(firstRobot.getroboTorso());
		System.out.println(firstRobot.getroboArms());
		System.out.println(firstRobot.getroboLegs());
	}

}
