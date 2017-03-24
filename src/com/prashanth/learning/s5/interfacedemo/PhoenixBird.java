package com.prashanth.learning.s5.interfacedemo;

public class PhoenixBird extends Bird {
	@Override
	public void eat(int food) {
		System.out.println("int:Phoenix ate "+food+" cereals.");
	}
	BirdSize size=BirdSize.large;
	@Override
	public void fly(){
		System.out.println("Phoenix flys very high.");
	}
	public void size(){
		System.out.println("Phoenix is a "+size+" bird.");
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
