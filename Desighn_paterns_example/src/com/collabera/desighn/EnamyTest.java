package com.collabera.desighn;

import java.util.Scanner;

public class EnamyTest {

	public static void main(String[] args) 
	{
		
	EnemyShip enemy = null;
	EnemyShip ufoShip = new EnamyUFO();
	EnemyFactory ef = new EnemyFactory();
	Scanner sc = new Scanner(System.in);
	
	String enamyOption = "";
	
	System.out.println("what type of Ship? (U/R/B)");
	
	if(sc.hasNextLine())
	{
		enamyOption = sc.nextLine();
		
		enemy = ef.makeEnemy(enamyOption);
	}
	
//	if(enamyOption.equals("U"))
//	{
//		enemy = new EnamyUFO();
//	}
//	else if(enamyOption.equals("R"))
//	{
//		enemy = new EnamyRocket();
//	}
	
	if(enemy != null)
	{
		doEnamyStuff(enemy);
	}
	else
	{
	 System.out.println("I am a half assed program \n that dose not check for wrong input");
	}
	sc.close();
	}
	
	public static void doEnamyStuff(EnemyShip daBad)
	{
		daBad.displayEnamyShip();
		daBad.followPlayer();
		daBad.enemyShipShoots();
	}

}
