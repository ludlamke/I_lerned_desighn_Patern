package com.collabera.desighn;

public abstract class EnemyShip 
{
private String name;
private double damageAmt;

public String getName() 
{
	return name;
}

public void setName(String newName) 
{
	name = newName;
}

public double getDamageAmt() 
{
	return damageAmt;
}

public void setDamageAmt(double newDamageAmt) 
{
	damageAmt = newDamageAmt;
}

public void followPlayer()
{
	System.out.println(getName() + " sees your dumb ass");
}
public void displayEnamyShip()
{
	System.out.println(getName() + " is on screen");
}


public void enemyShipShoots()
{
	System.out.println(getName() + " comen at you with: " + getDamageAmt());	
}

}