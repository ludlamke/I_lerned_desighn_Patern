package com.collabera.desighn.buider;

public class Robot implements RobotPlan {

	private String roboHead;
	private String roboTorso;
	private String roboArms;
	private String roboLegs;
	@Override
	public void setRobotHead(String head) 
	{
		roboHead = head;

	}

	public String getroboHead()
	{
		return roboHead;
	}
	
	@Override
	public void setRobotTorso(String torso) 
	{
		roboTorso = torso;

	}
	
	public String getroboTorso()
	{
		return roboTorso;
	}
	
	@Override
	public void setRobotArms(String arms) 
	{
		roboArms = arms;

	}

	public String getroboArms()
	{
		return roboArms;
	}
	
	@Override
	public void setRobotLegs(String legs) 
	{
		roboLegs = legs;

	}
	
	public String getroboLegs()
	{
		return roboLegs;
	}

}
