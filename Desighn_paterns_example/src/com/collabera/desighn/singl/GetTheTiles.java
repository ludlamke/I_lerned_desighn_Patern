package com.collabera.desighn.singl;

import java.util.LinkedList;

public class GetTheTiles implements Runnable
{
  public void run()
  {
	  Singleton newInstance = Singleton.getInstance();
	  
	  System.out.println("IID: " + System.identityHashCode(newInstance));
	  
	  System.out.println(newInstance.getLetterList());
	  
	  LinkedList<String> playerOneTiles = newInstance.getTiles(7);
	  
	  System.out.println("P: " + playerOneTiles);
	  
	  System.out.println("Got Tiles");
  }
}
