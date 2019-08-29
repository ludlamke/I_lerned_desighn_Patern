package com.collabera.desighn.facad;

public class FundsCheck 
{
  private double cashIn = 1000.00;
  
  public double getCash()
  {
	  return cashIn;
  }
  
  public void DecreaseCash(double withdraw)
  {
	  cashIn -= withdraw;
  }
  
  public void IncreaseCash(double deposit)
  {
	  cashIn += deposit; 
  }
  
  public boolean haveEnough(double toWithdraw)
  {
	  if(toWithdraw > getCash())
	  {
		  System.out.println("dont gots enoph");
		  System.out.println("dis wach you got" + getCash());
		  
		  return false;
	  }
	  else
	  {
		  DecreaseCash(toWithdraw);
		  System.out.println("dis wach you got" + getCash());
		  
		  return true;
	  }
  }
  
  public void makeDeposit(double toDeposit)
  {
	  IncreaseCash(toDeposit);
	  
	  System.out.println("dis wach you got" + getCash());
  }
}
