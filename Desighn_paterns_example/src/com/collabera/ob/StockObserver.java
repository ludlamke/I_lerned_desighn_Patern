package com.collabera.ob;

public class StockObserver implements Observer {

	double puterPrice; 
	double applepenPrice; 
	double ooglersPrice;	
	private static int observerIDTracker = 0;
	private int observerID;
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber)
	{
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer: " + this.observerID);
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double puterPrice, double applepenPrice, double ooglersPrice) 
	{	
		 this.puterPrice = puterPrice; 
		 this.applepenPrice = applepenPrice;
		 this.ooglersPrice	= ooglersPrice;
		 
		 PrintThePrices();
	}
	
	public void PrintThePrices()
	{
		System.out.println(observerID);
		System.out.println("puter is: " + puterPrice);
		System.out.println("applepen is: " + applepenPrice);
		System.out.println("ooglers is: " + ooglersPrice);
	}

}
