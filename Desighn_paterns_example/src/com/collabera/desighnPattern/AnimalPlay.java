package com.collabera.desighnPattern;

public class AnimalPlay {

	public static void main(String[] args) {
		Animal burgus = new Dog();
		
		Animal thi = new Bird();
		
		System.out.println(burgus.tryToFly());
		System.out.println(thi.tryToFly());
		
		burgus.setFlyingAbility(new ItFlys());
		System.out.println(burgus.tryToFly());

	}

}
