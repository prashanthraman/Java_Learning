package com.prashanth.learning.sample1;

import java.util.Scanner;

public class Do_While_Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=input.nextInt();
do
{
		if(x%2==0)
		System.out.println("Number entered is even number.");
		break;
}while(x!=5);
	}

}
