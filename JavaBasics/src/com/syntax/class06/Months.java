package com.syntax.class06;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your bitht month");
		String month=scan.nextLine();
		String season;
		if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season="Spring";
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season="Summer";
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season="Fall";
		}else if (month.equals("December") || month.equals("January") || month.equals("Februaly")) {
			season="Winter";
		}else {
			System.out.println("Wrong data");
			season="Invalid";
		}
		System.out.println("You was born in "+season);
	}
	}


