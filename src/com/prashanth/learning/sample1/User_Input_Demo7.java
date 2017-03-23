package com.prashanth.learning.sample1;

import java.util.Scanner;

public class User_Input_Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner trial=new Scanner(System.in);
System.out.println("Enter a number b/w 1 and 10.");
System.out.println("Enter a string.");
System.out.println("Enter a decimal number.");
int num1=trial.nextInt();
String val1=trial.next();
double d1=trial.nextDouble();
int num2=1;
for(;num2<=10;num2++)
System.out.println(num1+"*"+num2+"="+(num1*num2));
	}

}
