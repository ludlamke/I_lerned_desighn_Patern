package com.collabera.desighn.adapt;

public class TestEnemyAttckers 
{
     public static void main(String[] args) 
     {
		EnemyTank tankypoo = new EnemyTank();
		
		EnemyRobo billbob = new EnemyRobo();
		
		EnemyAttacker adapter = new EnemyRoboAdapter(billbob);
		
		billbob.reactToHuman("jackir");
		
		billbob.walkForward();
		billbob.smashWithHands();
		
		tankypoo.assignDriver("helmat");
		tankypoo.driveForward();
		tankypoo.fireWeapon();
		
		adapter.assignDriver("grny");
		adapter.driveForward();
		adapter.fireWeapon();
	 }
}
