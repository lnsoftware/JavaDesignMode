package com.mysoft.templatemethod.example;

public class Demo {

	public static void main(String[] args) {
		
		Account icbc = new ICBCAccount();

		Account citi = new CITIAccount();
		
		icbc.calculateInterest();
		
		citi.calculateInterest();
	}
}
