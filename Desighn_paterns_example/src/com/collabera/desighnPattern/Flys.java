package com.collabera.desighnPattern;

interface Flys 
{
	public String fly();
}

class ItFlys implements Flys
{
	public String fly()
	{
		return "i was high as a kite by now";
	}
}

class NoFlys implements Flys
{
	public String fly()
	{
		return "it's called falling in style";
	}
}

