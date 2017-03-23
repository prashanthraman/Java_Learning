package com.prashanth.learning.s5.Interface;

public class Bird implements Birds {
	public String color;
	private String size = "medium";
	public String name;

	@Override
	public void fly() {
		System.out.println("Birds fly.");

	}

	@Override
	public void chirp() {
		System.out.println("Birds chirp early in the morning.");

	}

	@Override
	public void eat(String food) {
		System.out.println("The bird ate 2 cereal.");

	}

	@Override
	public void eat(int food) {
		System.out.println("The bird drank water.");

	}

	@Override
	public void eat(double food) {
		System.out.println("The bird ate seeds.");

	}

}
