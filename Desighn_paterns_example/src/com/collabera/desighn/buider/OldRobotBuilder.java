package com.collabera.desighn.buider;

public class OldRobotBuilder implements RobotBuilder 
{
	
	private Robot robot;
	
	public OldRobotBuilder()
	{
		this.robot = new Robot();
	}

	@Override
	public void buildRoboHead() 
	{
		
		robot.setRobotHead("empty head");
	}

	@Override
	public void buildRoboTorso() 
	{
		robot.setRobotTorso("rules torso");

	}

	@Override
	public void buildRoboArms() 
	{
		robot.setRobotArms("pupet arms");
	}

	@Override
	public void buildRoboLegs() 
	{
		robot.setRobotLegs("pathed legs");

	}

	@Override
	public Robot getRobot() 
	{
		
		return this.robot;
	}

}
