package com.prashanth.learning.sample1;

import java.util.Scanner;

public class Switch_Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner getval=new Scanner(System.in);
System.out.println("Enter the name of the game");
String input=getval.nextLine();
switch(input.toUpperCase()){
case "GOD OF WAR":
	System.out.println("Its the best ever action game made");
	break;
case "Fifa":
	System.out.println("Best sports game");
	break;
	default:
		System.out.println("Yet to try that game");
		getval.close();
}
	}

}
