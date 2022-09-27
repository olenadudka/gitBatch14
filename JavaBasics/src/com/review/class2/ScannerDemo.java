package com.review.class2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter your name");
String name=scanner.nextLine();
System.out.println("Enter your age");
int age=scanner.nextInt();

System.out.println(name+" is "+age+" years old");
	}  
}


