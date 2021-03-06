package com.prashanth.learning.s5.interfacedemo;

public class Bird implements BirdInterface {
	public String color;
	public String name;
	
	@Override
	public void fly() {
		System.out.println("Birds fly.");

	}

	@Override
	public void chirp() {
		System.out.println("Birds chirp early in the morning.");

	}

	/**
	 * eat method is overloaded
	 * Each method signature is overloaded based on String, int, double
	 */
	@Override
	public void eat(String food) {
		System.out.println("String: The bird ate "+food+" cereal.");

	}

	@Override
	public void eat(int food) {
		System.out.println("int:The bird drank "+food+"ml water.");

	}

	@Override
	public void eat(double food) {
		System.out.println("double:The bird ate "+food+" seeds.");

	}
	
	public void migrate(){
		System.out.println("The bird migrated 5000 miles");
	}

}
