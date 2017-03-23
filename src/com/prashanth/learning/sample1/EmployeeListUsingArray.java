package com.prashanth.learning.sample1;

import java.util.Calendar;
import java.util.Scanner;

class Employee1{
	String first_name;
	String last_name;
	String date_of_birth;
	String department;
	int salary;
	String email;
	int age_year;
	int age_month;
	int age_day;
	int year=Calendar.getInstance().get(Calendar.YEAR);
//	String dob_year=date_of_birth[i].substring(6);
//	int dob=Integer.parseInt(dob_year);
	
/*	int getAge(){
		LocalDate birthdate = new LocalDate (age_year, age_month, age_day);
		LocalDate now = new LocalDate();
		Year age = Years.yearsBetween(birthdate, now);
	}*/
	
}
public class EmployeeListUsingArray {
	public static void main(String args[]) {
		System.out.println("Enter the # of Employees:");
		Scanner scan=new Scanner(System.in);
		int emp_count=scan.nextInt();
		scan.nextLine();
		Employee[] employee1=new Employee[emp_count];
		
		for(int i=0;i<emp_count;i++){
			
		}
	}
}
