package com.collabera.desighn.adapt;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {

	Random generator = new Random();
	@Override
	public void fireWeapon() 
	{
		int attackDamag = generator.nextInt(10) + 1;
		System.out.println("Enemy Tank Does da bad at " + attackDamag);

	}

	@Override
	public void driveForward() 
	{
	 int movement = generator.nextInt(5) + 1;
	 
	 System.out.println("Enemy Tank moves " + movement + "places");

	}


	@Override
	public void assignDriver(String driverName) 
	{
		System.out.println(driverName + "got da big gun");
		
	}

}
