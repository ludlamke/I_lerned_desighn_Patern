package com.collabera.desighn.facad;

public class AccountNumberCheck 
{
 private int accountNumber = 12345678;
 
 public int getAccountNumber()
 {
	 return accountNumber;
 }
 
 public boolean accountActive(int acctToCheck)
 {
	 if(acctToCheck == getAccountNumber())
	 {
		 return true;
	 }
	 else 
	 {
		 return false; 
	 }
 }
}
