package com.prashanth.learning.s5.Interface;

public class Phoenix extends Bird {
	public void eat(int food) {
		System.out.println("Phoenix ate 5 cereals.");
	}
	
	public void fly(){
		System.out.println("Phoenix flys very high.");
	}

	public String toStringName() {
		return name;
	}

	// public String toStringSize(){
	// return size;
	// }
	public String toStringColor() {
		return color;
	}
}
