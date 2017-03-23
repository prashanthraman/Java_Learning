package com.prashanth.learning.sample1;

import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

class Employee{
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
	
	/*int getAge(){
		LocalDate birthdate = new LocalDate (age_year, age_month, age_day);
		LocalDate now = new LocalDate();
		Year age = Years.yearsBetween(birthdate, now);
	}*/
	
}
public class Demo11_Class_Method {

	public static void main(String[] args) {
		System.out.println("Enter the # of Employees:");
		Scanner scan=new Scanner(System.in);
		int emp_count=scan.nextInt();
		scan.nextLine();
		Employee[] employee1=new Employee[emp_count];
		for(int i=0;i<emp_count;i++){
			System.out.println("Enter the employee first name:");
			employee1[i] = new Employee();
			employee1[i].first_name=scan.nextLine();
			System.out.println("Enter the employee last name:");
			employee1[i].last_name=scan.nextLine();
			System.out.println("Enter the employee DOB in mm-dd-yyyy format:");
			employee1[i].date_of_birth=scan.nextLine();
			// TODO: use 1 Date object using Simple Date formatter instead of storing date in 3 objects
			employee1[i].age_year=Integer.parseInt(employee1[i].date_of_birth.substring(6));
			employee1[i].age_month=Integer.parseInt(employee1[i].date_of_birth.substring(0,2));
			employee1[i].age_day=Integer.parseInt(employee1[i].date_of_birth.substring(3,2));
			employee1[i].first_name=scan.nextLine();
			System.out.println("Enter the employee department name:");
			employee1[i].department=scan.nextLine();
			System.out.println("Enter the employee salary:");
			employee1[i].salary=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the employee email:");
			employee1[i].email=scan.nextLine();
			
			for(int j=0;j<emp_count;j++){
				//System.out.println("First Name" + "\t" + "Last Name" + "\t" + "Age" + "\t" + "Department" + "\t" + "Salary");
				
				String.format("Name: {0} {1} \t  Age: {2} \t Department: \t Salary: {4} \n");
				//System.out.println(first_name[j] + "\t\t" + last_name[j] + "\t\t" + age[j] + "\t" + department[j] + "\ta\t" + salary[j]);
			}
		}
		
		// TODO Auto-generated method stub

	}

}
