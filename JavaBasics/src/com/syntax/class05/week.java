package com.syntax.class05;

import java.util.Scanner;

public class week {

	public static void main(String[] args) {
		/*Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday”,
		 *  anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
		 *  
		 */
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the weekday");
int weekday=scan.nextInt();
if(weekday>=1 && weekday<=5) {
	System.out.println("it is a weekday");
} else if (weekday >5 && weekday<=7) {
	System.out.println("Weekend");
} else {
	System.out.println("Invalid day");
}
	
}
	}


