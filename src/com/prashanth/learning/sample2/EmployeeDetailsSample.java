package com.prashanth.learning.sample2;

import java.util.Scanner;

public class EmployeeDetailsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the # of employees:");
		Scanner scan=new Scanner(System.in);
		int no_of_emp=scan.nextInt();
		scan.nextLine();
		Employee[] emp=new Employee[no_of_emp];
		for(int i=0;i<no_of_emp;i++){
			emp[i]=new Employee();
			System.out.println("Enter the employee first name:");
			emp[i].setFirstName(scan.nextLine());
			System.out.println("Enter the employee last name:");
			emp[i].setLastName(scan.nextLine());
			System.out.println("Enter the employee DOB in mm-dd-yyyy format:");
			emp[i].setDateOfBirth(scan.nextLine());
			System.out.println("Enter the employee Department:");
			emp[i].setDepartment(scan.nextLine());
			System.out.println("Enter the employee mail:");
			emp[i].setEmail(scan.nextLine());
			System.out.println("Enter the employee salary:");
			emp[i].setSalary(scan.nextInt());
			scan.nextLine();
			scan.close();
		}
		for(int j=0;j<no_of_emp;j++)
		{
			System.out.println(emp[j].toString());
			}
		}

	}

