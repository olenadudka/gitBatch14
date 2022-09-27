package com.syntax.class06;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Allow user to enter grade (A, B, or C etc...) and then provide explanation:
 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
 *  *	At the end your program should print which grade was entered by a user with explanation.
 */
	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		char grade=scan.next().charAt(0);
		String explan;
		switch (grade) {
		case 'A':
			explan="Excellent";
			break;
		case 'B':
			explan="Good";
			break;
		case 'C':
			explan="Average";
			break;
		case 'D':
			explan="Bad";
			break;
			default:
				explan="Not aseptable";
		}
		System.out.println("Your grade is "+grade+ " and it means "+explan);
	}

}
