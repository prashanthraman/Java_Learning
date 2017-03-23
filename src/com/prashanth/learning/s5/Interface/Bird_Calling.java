package com.prashanth.learning.s5.Interface;

public class Bird_Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird1=new Bird();
		
		Phoenix ph1=new Phoenix();
		
		ph1.fly();
		ph1.color="Multi-colored";
		System.out.println("Phoenix is a "+ph1.color+" bird.");
		ph1.chirp();
		
		
		bird1.eat(2.5);
		bird1.eat(1);
		bird1.eat("Phoenix");
		bird1.fly();
		bird1.chirp();
		

	}

}
