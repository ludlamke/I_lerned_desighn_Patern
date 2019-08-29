package com.collabera.desighn;

public class EnemyFactory 
{

	public EnemyShip makeEnemy(String newShipType) 
	{
		 EnemyShip newShip = null;
		 
		 if(newShipType.equals("U"))
		 {
			 return new EnamyUFO();
		 }
		 else if(newShipType.equals("R"))
		 {
			 return new EnamyRocket();
		 }
		 else if(newShipType.equals("B"))
		 {
			 return new BigUFO();
		 }
		 else
		 {
			 return null;
		 }


	}

}
