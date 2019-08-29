package com.collabera.desighn.deco;

public class PizzaMaker {

	public static void main(String[] args) 
	{
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		
		System.out.println("ingrds: " + basicPizza.getDescription());
		
		System.out.println("price: " + basicPizza.getCost());

	}

}
