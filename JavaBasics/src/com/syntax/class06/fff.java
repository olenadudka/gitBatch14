package com.syntax.class06;

public class fff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * find the largest number
		 * find if the largest number is even or odd?
		 */
		int n1=100;
		int n2=200;
		int n3=300;

		if(n1>n2 && n1>n3) {
			System.out.println(n1+" is the largest");
			if(n1%2==0) {
				System.out.println(n1+" is even");
			}
			else {
				System.out.println(n1+" is odd");
			}
		} else if (n2>n3 && n2>n1) {
			System.out.println(n2+"is the largest");
		} else if (n3>n1 && n3>n2) {
			System.out.println(n3+" is the largest");
		}

		System.out.println("----Switching-------------");
		int largest = 0;
		
		if(n1>n2 && n1>n3) {
			largest=n1;
			
			
		} else if (n2>n3 && n2>n1) {
			largest=n2;
		} else if (n3>n1 && n3>n2) {
			largest=n3;
		}
		
		System.out.println(largest+" is the largest number");
	if(largest!=0) {
	
	if(largest%2==0) {
		System.out.println(largest+" is even number");
		
	}else {
		System.out.println(largest+" is odd number");
	}
	}}
}
