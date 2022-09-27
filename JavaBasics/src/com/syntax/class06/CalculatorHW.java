package com.syntax.class06;

import java.util.Scanner;

public class CalculatorHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *  Using scanner class create calculator. Allow user to enter 2 numbers 
 *  and operator(+,-,*,/). Based on operator provide the result to user.
Please complete this assignment in 2 ways: using if statement and switch case.
 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number 1");
		int number1=scan.nextInt();
		System.out.println("Please enter number 2");
		int number2=scan.nextInt();
		System.out.println("Please choose the operator +,-,/ or *");
		char operator=scan.next().charAt(0);
		int sum=number1+number2;
		int sub=number1-number2;
		double div=number1/number2;
		int mult=number1*number2;
		
  if (operator=='+') {
	  System.out.println(sum);
  }
	  else if (operator=='-') {
		  System.out.println(sub);
	  }else if(operator=='*') {
		  System.out.println(mult);
	  }else if (operator=='/') {
		  System.out.println(div);
	  }else
		  System.out.println("Invalid data was entered");
  }
		
	}
 

