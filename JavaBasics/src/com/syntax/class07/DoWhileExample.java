package com.syntax.class07;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 */
		Scanner sc=new Scanner(System.in);
		String answer;
		do {
		
		System.out.println("Did you get a job");
	 answer=sc.nextLine();
		}while(!answer.equals("yes"));
		System.out.println("Congrats");
	}

}
