package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		String name="Olena";
		String lastname="Dudka";
		char grade='A';
		String city="VB";
		String state="Virginia";
		int phoneNumber=757111111;
		System.out.println("My name is "+name+" and my last name is "+lastname);
		System.out.println("I am "+grade+" student.");
		System.out.println("I live in "+city);
		System.out.println("And my phone number is "+phoneNumber);
		// TODO Auto-generated method stub
		
		city="New York";
		state="New Jersey";
		grade='B';
		phoneNumber=4444444;
		System.out.println("My name is "+name +" And I moved to new city  "+ city +" and new state " + state +".My new phone number is "+phoneNumber);
		  //Rules or identifiers =names
		//1.Cant use keywords for identifiers
		//2.Cannot use spaces in identifiers
		//3.Identifiers cannot start with numbers
		/*4. Identifiers cannot contain any special characters
		 * except $ or_
		 
		 */
		double $price=9.98;
		float _price1=1.99F;
		
		//Naming conventions
		//Class should start from uppercase
		//variables should start from lowercase and follow camelcase

	}

}
