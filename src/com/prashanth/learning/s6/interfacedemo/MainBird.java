package com.prashanth.learning.s6.interfacedemo;

public class MainBird {

	public static void main(String[] args) {
		BirdInterface encapsulatedBird = new Bird();
		Bird bird1=new Bird();
		bird1.setName("Sparrow");
		bird1.setColor("Brown");
		PhoenixBird ph1=new PhoenixBird();
		
		ph1.fly();
		ph1.setName("Phoenix");
		ph1.setColor("Multi-colored");
		System.out.println("Phoenix is a "+ph1.getColor()+" bird.");
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
		
		encapsulatedBird.chirp();
		encapsulatedBird.fly();
		encapsulatedBird.eat("20");
		// cannot migrate encapsulated bird
		// encapsulatedBird.migrate();

	}

}
