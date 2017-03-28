package com.prashanth.learning.s6.interfacedemo;

import java.text.MessageFormat;

public class Bird implements BirdInterface {
	private String color;
	private String name;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.println("Birds fly.");

	}

	@Override
	public void chirp() {
		System.out.println("Birds chirp early in the morning.");

	}

	/**
	 * eat method is overloaded Each method signature is overloaded based on
	 * String, int, double
	 */
	@Override
	public void eat(String food) {
		System.out.println("String: The bird ate " + food + " cereal.");

	}

	@Override
	public void eat(int food) {
		System.out.println("int:The bird drank " + food + "ml water.");

	}

	@Override
	public void eat(double food) {
		System.out.println("double:The bird ate " + food + " seeds.");

	}

	public void migrate() {
		System.out.println("The bird migrated 5000 miles.");
	}

	public String toString() {
		return MessageFormat.format("The birds name is {0}. The color of the bird is {1}.", getName(), getColor());
	}
}
