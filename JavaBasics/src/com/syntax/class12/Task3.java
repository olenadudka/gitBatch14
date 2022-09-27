package com.syntax.class12;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Write a program that reads two people's first
names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
 */
		Scanner scan=new Scanner(System.in);
		String momName;
		String dadName;
		String babyName;
		String gender;
		
		System.out.println("Mom's first name?");
		momName=scan.nextLine();
		System.out.println("Dad's first name?");
		dadName=scan.nextLine();
		System.out.println("Enter a gender od your baby");
		gender=scan.nextLine();
		if(gender.toLowerCase().equals("boy")) {
			System.out.println(dadName.substring((0),(dadName.length()/2))+(momName.substring(momName.length()/2, momName.length()) ));
		}else {
			System.out.println(momName.substring((0), (momName.length()/2))+(dadName.substring(dadName.length()/2, dadName.length())));
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}
