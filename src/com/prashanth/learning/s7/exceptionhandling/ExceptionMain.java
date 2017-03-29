package com.prashanth.learning.s7.exceptionhandling;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		NumberExceptionHandling exha= new NumberExceptionHandling();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the total cash:");
		exha.setTotal_cash(scan.nextDouble());
		scan.nextLine();
		System.out.println("Enter the # of people:");
		exha.setSplit_count(scan.nextInt());
		scan.nextLine();
		try{
			exha.calculateShare();
		}catch(ArithmeticException e){
			System.out.println("# of person cannot be zero.");
		}
		System.out.println("Split for each person is:"+exha.calculateShare());
		
		FileExceptionHandling fexha=new FileExceptionHandling();
		System.out.println("Enter the file name with full path:");
		String path=scan.nextLine();
		fexha.ReadFile(path);
	}
	
}
