package com.collabera.desighn.facad;

public class SecurityCodeCheck 
{
  private int SC = 1234;
  
  public int getSC() 
  {
	  return SC;
  }
  
  public boolean isCode(int codeToCheck)
  {
	  if(codeToCheck == getSC())
	  {
		  return true;
	  }
	  else 
	  {
		  return false;
	  }
  }
  
  
}
