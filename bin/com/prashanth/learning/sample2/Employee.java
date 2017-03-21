package com.prashanth.sample1;

import java.util.Calendar;

public class Employee {
	private String first_name;
	private String last_name;
	private String date_of_birth;
	private String department;
	private int salary;
	private String email;
	private int year=Calendar.getInstance().get(Calendar.YEAR);
	
	public String getFirstName(){
		 return first_name;
	}
	
	public String getLastName(){
		 return last_name;
	}
	
	public String getDateOfBirth(){
		 return date_of_birth;
	}
	
	public String getDepartment(){
		 return department;
	}
	
	public String getEmail(){
		 return email;
	}
	
	public int getSalary(){
		 return salary;
	}
	
	public void setFirstName(String fst){
		 first_name=fst;
	}
	
	public void setLastName(String lst){
		 last_name=lst;
	}
	
	public String setDateOfBirth(String dob){
		 return date_of_birth=dob;
	}
	
	public void setDepartment(String dep){
		 department=dep;
	}
	
	public void setEmail(String mail){
		 email=mail;
	}
	
	public void setSalary(int sal){
		 salary=sal;
	}
	
	public int calculateAge(){
		return year-Integer.parseInt(date_of_birth.substring(5));
	}
	
	public String toString() {
		  return "Name: " + getFirstName() + " " +getLastName() +"\t Department: " + getDepartment()+"Salary:" +getSalary()+"Age:"+calculateAge();
	}

}
