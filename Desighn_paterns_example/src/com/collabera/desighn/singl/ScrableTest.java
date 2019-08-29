package com.collabera.desighn.singl;

import java.util.LinkedList;

public class ScrableTest {

	public static void main(String[] args) 
	{
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("IID: " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("p1: " + playerOneTiles);
		
		System.out.println(newInstance.getLetterList());
		
		Singleton instanceTwo = Singleton.getInstance();
		
		System.out.println("IID2: " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		
		System.out.println("p2: " + playerTwoTiles);
		
	}

}
