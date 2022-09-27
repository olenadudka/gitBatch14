package com.syntax.class4;

import java.util.Scanner;

public class InputFromKeyBoard3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter your name"); //takes a String input from the keyboard and stores it in name variable
		String name=scanner.nextLine();
		System.out.println("Please enter your age");
		int age=scanner.nextInt();
		
		System.out.println("Hi "+name+" you are " +age+" years old");
		
	}

}
