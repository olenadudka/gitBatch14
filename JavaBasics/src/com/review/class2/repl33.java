package com.review.class2;

import java.util.Scanner;

public class repl33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter a number");
int number=scanner.nextInt();
if (number%2==0) {
	System.out.println("Value is even");
	if(number>1000) {
		System.out.println("Even number is large");
	} else {
		System.out.println("Even value is just right");
	}
}else {
	System.out.println("Value is odd");
	if(number>1000) {
		System.out.println("Odd value is large");
	}else {
		System.out.println("Odd value is just right");
	}
}
	}

}
