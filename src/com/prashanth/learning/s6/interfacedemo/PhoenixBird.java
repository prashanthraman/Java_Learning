package com.prashanth.learning.s6.interfacedemo;

import java.text.MessageFormat;

public class PhoenixBird extends Bird {
	BirdSize size = BirdSize.LARGE;

	public BirdSize getSize() {
		return size;
	}

	public void setSize(BirdSize size) {
		this.size = size;
	}

	@Override
	public void eat(int food) {
		System.out.println("int:Phoenix ate " + food + " cereals.");
	}

	@Override
	public void fly() {
		System.out.println("Phoenix flys very high.");
	}

	public void size() {
		System.out.println("Phoenix is a " + size + " bird.");
	}

	/**
	 * this method overrides name, color of Bird class. Implements Size of its
	 * own
	 */
	public String toString() {
		return MessageFormat.format("The birds name is {0}. The color of the bird is {1}. Its a {2} size bird.",
				getName(), getColor(), getSize());
	}
}
