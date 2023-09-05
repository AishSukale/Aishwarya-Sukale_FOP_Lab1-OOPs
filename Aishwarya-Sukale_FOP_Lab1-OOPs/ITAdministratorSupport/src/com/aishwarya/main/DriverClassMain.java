package com.aishwarya.main;

import java.util.Scanner;

import com.aishwarya.CredentialService.CredentialService;

import ITEmployee.EmployeeCredentials;

import ITEmployee.MyCredentials;

public class DriverClassMain {

	public static void main(String[] args) {	

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter First Name:");
		String fname = sc.next();
		
		System.out.println("Please enter Last Name:");
		String lname = sc.next();
		
		EmployeeCredentials emp = new EmployeeCredentials(fname, lname);
		
		MyCredentials credential = new CredentialService();
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1: 
			emp.setDepartment("tech");
			break;
		
		case 2: 
			emp.setDepartment("adm");
			break;
		
		case 3: 
			emp.setDepartment("hr");
			break;
		
		case 4: 
			emp.setDepartment("legal");
			break;
		
		default: 
			System.out.println("Hey wrong Choice! Please enter correct choice...");
			break;
			
		}
		
		
		if(emp.getFirstName() != null && emp.getLastName() != null && emp.getDepartment() != null) {
			credential.generateEmail(fname, lname, emp.getDepartment(),emp);
			credential.generatePassword(emp);
			credential.showCredentials(emp);
		}
		else
		{
			System.out.println("Sorry! Invalid employee details");
		}
		
		sc.close();

	}

}
