package com.collabera.desighn.prto;

public class CloneFactory 
{
	public Animal getClone(Animal Sample)
	{
		return Sample.makeCopy();
	}
}
