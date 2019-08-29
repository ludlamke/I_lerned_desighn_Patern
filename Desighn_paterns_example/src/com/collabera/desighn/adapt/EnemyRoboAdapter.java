package com.collabera.desighn.adapt;

public class EnemyRoboAdapter implements EnemyAttacker {

	EnemyRobo daRobo;
	
	public EnemyRoboAdapter(EnemyRobo newRobo)
	{
		daRobo = newRobo;
				
	}
	@Override
	public void fireWeapon() 
	{
		daRobo.smashWithHands();

	}

	@Override
	public void driveForward() 
	{
		daRobo.walkForward();

	}

	@Override
	public void assignDriver(String driverName) 
	{
		daRobo.reactToHuman(driverName);

	}

}
