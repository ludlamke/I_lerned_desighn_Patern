package com.collabera.desighn.prto;

public class testCloning {

	public static void main(String[] args) 
	{
		CloneFactory animalMaker = new CloneFactory();
		
		Sheep grug = new Sheep();
		
		Sheep clonedSheep = (Sheep) animalMaker.getClone(grug);
		
		System.out.println(grug);
		
		System.out.println(clonedSheep);
		
		System.out.println(System.identityHashCode(System.identityHashCode(grug)));
		
		System.out.println(System.identityHashCode(System.identityHashCode(clonedSheep)));
		

	}

}
