package com.collabera.desighnPattern;

public class MainClass {

	public static void main(String[] args) {
		int randNum = 69;
		Dog fido = new Dog();
		
		fido.setName("magicBanna");
		System.out.println(fido.getName());
		
		fido.digHole();
		
		fido.setWeight(-99);
		
		fido.ChangVar(randNum);
		
		System.out.println("randmum is: " + randNum);
		
		changeObjectName(fido);
		
		System.out.println("new dog name: " + fido.getName());

	}
	
	public static void changeObjectName(Dog fido)
	{
		fido.setName("banaMagic");
	}

}
