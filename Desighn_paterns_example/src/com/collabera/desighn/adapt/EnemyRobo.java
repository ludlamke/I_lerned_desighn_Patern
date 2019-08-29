package com.collabera.desighn.adapt;

import java.util.Random;
public class EnemyRobo 
{
  Random generator = new Random();
  
  public void smashWithHands()
  {
	  int attDam = generator.nextInt(10)+1;
	  
	  System.out.println("enamy robo does the dammig" + attDam);
  }
  
  public void walkForward()
  {
	  int movment = generator.nextInt(5) + 1;
	  System.out.println("Enemy rodo dose da shuffle" + movment);
  }
  
  public void reactToHuman(String driverName)
  {
	  System.out.println("enmy robo dance on " + driverName);
	  
  }
}
