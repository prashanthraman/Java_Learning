package com.prashanth.learning.s5.interfacedemo;

public class BirdCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird1=new Bird();
		
		PhoenixBird ph1=new PhoenixBird();
		
		ph1.fly();
		ph1.color="Multi-colored";
		System.out.println("Phoenix is a "+ph1.color+" bird.");
		ph1.chirp();
		ph1.size();
		
		
		bird1.eat(2.5);
		bird1.eat(1);
		bird1.eat("5");
		bird1.fly();
		bird1.chirp();
		

	}

}
