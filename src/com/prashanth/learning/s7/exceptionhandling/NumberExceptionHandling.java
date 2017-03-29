package com.prashanth.learning.s7.exceptionhandling;

public class NumberExceptionHandling {
	private double total_cash;
	private int split_count;
	
	public double getTotal_cash() {
		return total_cash;
	}
	public void setTotal_cash(double total_cash) {
		this.total_cash = total_cash;
	}
	public double getSplit_count() {
		return split_count;
	}
	public void setSplit_count(int split_count) {
		this.split_count = split_count;
	}
	
	public double calculateShare(){
		return total_cash/split_count;
	}
	
}
