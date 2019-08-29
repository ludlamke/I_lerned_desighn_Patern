package com.collabera.desighn.facad;

public class BankAccountFacade 
{
   private int accountNumber;
   
   private int SecurityCode;
   
   AccountNumberCheck acctChecker;
   SecurityCodeCheck codeChecker;
   FundsCheck fundChecker;
   
   WelcomToBank welcomer;
   
   public BankAccountFacade(int newAcctNum, int newSecCode)
   {
	   accountNumber = newAcctNum;
	   SecurityCode = newSecCode;
	   
	   welcomer = new WelcomToBank();
	   acctChecker = new AccountNumberCheck();
	   codeChecker = new SecurityCodeCheck();
	   fundChecker = new FundsCheck();
   }
   
   public int getAcctNum()
   {
	   return accountNumber;
   }
   public int getSecCode()
   {
	   return SecurityCode;
   }
   
   public void withdrawCash(double cashGet)
   {
	   if(acctChecker.accountActive(getAcctNum()) && codeChecker.isCode(getSecCode()) && fundChecker.haveEnough(cashGet))
	   {
		   System.out.println("it go thru");
	   }
	   else
	   {
		   System.out.println("errorr");
	   }
   }
   
   public void depositCash(double cashDepos)
   {
	   if(acctChecker.accountActive(getAcctNum()) && codeChecker.isCode(getSecCode()))
			   {
		          fundChecker.makeDeposit(cashDepos);
		          System.out.println("it go thru");
			   }
			   else
			   {
				   System.out.println("errorr");
			   }
    }
  }

