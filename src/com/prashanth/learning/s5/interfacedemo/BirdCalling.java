package com.prashanth.learning.s5.interfacedemo;

public class BirdCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirdInterface encapsulatedBird = new Bird();
		Bird bird1=new Bird();
		
		PhoenixBird ph1=new PhoenixBird();
		
		ph1.fly();
		ph1.color="Multi-colored";
		System.out.println("Phoenix is a "+ph1.color+" bird.");
		ph1.chirp();
		ph1.size();
		System.out.println(ph1);
		ph1.migrate();
		
		bird1.eat(2.5);
		bird1.eat(1);
		bird1.eat("5");
		bird1.fly();
		bird1.chirp();
		bird1.migrate();
		
		// cannot migrate encapsulated bird
		// encapsulatedBird.migrate();

	}

}
