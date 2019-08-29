package com.collabera.ob;

import java.util.ArrayList;

public class StockGrabber implements Subject
{

	private ArrayList<Observer> observers;
	private double puterPrice; 
	private double applepenPrice; 
	private double ooglersPrice;
	
	public StockGrabber()
	{
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer newObserver) 
	{
		
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) 
	{
		int observerIndex = observers.indexOf(deleteObserver);
		
		System.out.println("observer " + (observerIndex+1) + " go bye bye");
		
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() 
	{
		
		for(Observer observer : observers)
		{
			observer.update(puterPrice, applepenPrice, ooglersPrice);
		}
	}
	
	public void setputerPrice(double newPuterPrice)
	{
		this.puterPrice = newPuterPrice;
		notifyObserver();
	}
	
	public void setapplepenPrice(double newapplepenPrice)
	{
		this.applepenPrice = newapplepenPrice;
		notifyObserver();
	}
	
	public void setooglersPrice(double newooglersPrice)
	{
		this.ooglersPrice = newooglersPrice;
		notifyObserver();
	}



}
