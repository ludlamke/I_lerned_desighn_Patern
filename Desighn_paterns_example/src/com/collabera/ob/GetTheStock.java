package com.collabera.ob;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable
{
private int startTime;
private String stock;
private double price;

private Subject stockGrabber;

public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice)
{
	this.stockGrabber = stockGrabber;
	startTime = newStartTime;
	stock = newStock;
	price = newPrice;
}

@Override
public void run() 
{
	for(int i=1; i <= 20; i++)
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
		
		double randNum = (Math.random() * (.06)) - .03;
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		if(stock == "puter")
		{
			((StockGrabber)stockGrabber).setputerPrice(price);
		}
		else if(stock == "applepen")
		{
			((StockGrabber)stockGrabber).setapplepenPrice(price);
		}
		else if(stock == "oogle")
		{
			((StockGrabber)stockGrabber).setooglersPrice(price);
		}
		
		
		System.out.println(stock + ": " + df.format(price + randNum) + " " + df.format(randNum));
		
		System.out.println();
		
	}
	
}

}
