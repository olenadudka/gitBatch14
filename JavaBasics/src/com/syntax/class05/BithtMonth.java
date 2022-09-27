package com.syntax.class05;

import java.util.Scanner;

public class BithtMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring” 
if user is born in June, July, August → 
season =”Summer”  etc …
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your bitht month");
		String month=scan.nextLine();
		if (month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("Season is spring");
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("Season is summer");
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("Season is fall");
		}else if (month.equals("December") || month.equals("January") || month.equals("Februaly")) {
			System.out.println("Season is winter");
		}else
			System.out.println("Invalid data was entered");

	}

}
