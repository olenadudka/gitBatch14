package com.syntax.class4;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program to ask user to enter numbers 
		 * of worked years and annual salary. If user worked for more or equals to 5 years
		 *  than user is eligible for the bonus, otherwise he is not. Once user is eligible and salary is
		 *   larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */

		Scanner scanner=new Scanner(System.in);
		System.out.println("How many years do you work in a company?");
		int years=scanner.nextInt();
		if (years>=5)
		{
			System.out.println("You are eligible for the bonus.What is your annual salary?");
			int salary=scanner.nextInt();
			if (salary>50000)
			{
				System.out.println("Your bonus is 500");
				
			}
			else
			{
				System.out.println("Your bonus is 300");
			}
		}
		else
			System.out.println("You are not eligible for the bonus");
	}

}
