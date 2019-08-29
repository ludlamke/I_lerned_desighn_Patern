package com.collabera.ob;

public class GrabStocks {

	public static void main(String[] args) 
	{
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver obsever1 = new StockObserver(stockGrabber);
		StockObserver obsever2 = new StockObserver(stockGrabber);
		
		stockGrabber.setputerPrice(90.00);
		stockGrabber.setapplepenPrice(500.70);
		stockGrabber.setooglersPrice(435.23);
		
		stockGrabber.unregister(obsever1);
		
		Runnable getPuter = new GetTheStock(stockGrabber, 2, "puter", 90.00);
		Runnable getApplepen = new GetTheStock(stockGrabber, 2, "applepen", 500.70);
		Runnable getOoglrs = new GetTheStock(stockGrabber, 2, "oogler", 435.23);
		
		new Thread(getPuter).start();
		new Thread(getApplepen).start();
		new Thread(getOoglrs).start();
	}

}
