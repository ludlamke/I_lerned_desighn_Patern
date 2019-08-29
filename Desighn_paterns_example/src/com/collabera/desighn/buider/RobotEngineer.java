package com.collabera.desighn.buider;

public class RobotEngineer 
{
   private RobotBuilder roboBuilder;
   
   public RobotEngineer(RobotBuilder roboBuilder)
   {
	   this.roboBuilder = roboBuilder;
   }
   
   public Robot getRobot()
   {
	   return this.roboBuilder.getRobot();
	   
   }
   
   public void makeRobo()
   {
	   this.roboBuilder.buildRoboHead();
	   this.roboBuilder.buildRoboTorso();
	   this.roboBuilder.buildRoboArms();
	   this.roboBuilder.buildRoboLegs();
   }
}
