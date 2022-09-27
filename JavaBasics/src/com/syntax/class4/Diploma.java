package com.syntax.class4;

import java.util.Scanner;

public class Diploma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a diploma please enter true or false");
boolean youHaveDiploma=scanner.nextBoolean();

if(youHaveDiploma)
{
	System.out.println("Congradulations");
System.out.println("What is your GPA score?");

	double GPA=scanner.nextDouble();
	
	if(GPA>=3.5) {
		System.out.println("You are eligible for schoolarship");
	}
	else {
	System.out.println("You should have studied harder");
	
}
}
	else 
	{System.out.println("Please get a degree");

	
 

	}
	}}

	


