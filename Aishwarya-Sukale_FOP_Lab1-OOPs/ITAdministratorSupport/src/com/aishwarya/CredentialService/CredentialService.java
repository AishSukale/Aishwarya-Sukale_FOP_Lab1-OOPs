package com.aishwarya.CredentialService;

import java.util.Random;

import ITEmployee.*;


public class CredentialService implements MyCredentials {
	
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialChars = "!@#$%^&*()-+=_/?><,.;:/|\";";
	
	String generatedPassword = capitalLetters + smallLetters + numbers + specialChars;
	
	Random random = new Random();
	
	String passwordFinal = "";
	
	@Override
	public String generatePassword(EmployeeCredentials employee) {
		
		for(int i=0; i<8; i++) {
			passwordFinal = passwordFinal + generatedPassword.charAt(random.nextInt(generatedPassword.length())); 
		}
		
		employee.setPassword(passwordFinal);
		return passwordFinal.toString();
	}

	@Override
	public String generateEmail(String fname, String lname, String department,EmployeeCredentials employee) {
		
		String generatedEmail = fname.toLowerCase() + lname.toLowerCase() + "@" + department.toLowerCase() + ".gl.com";
		employee.setEmail(generatedEmail);
		return generatedEmail.toString();
	}
	

	@Override
	public void showCredentials(EmployeeCredentials employee) {
		
		System.out.println("\nDear " +employee.getFirstName()+ " your generated credentials are as follows:");
		System.out.println("Email ---->  "+employee.getEmail());
		System.out.println("Password ---->  "+employee.getPassword());
		
	}
	
	

}
