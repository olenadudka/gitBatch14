package com.syntax.class08;

import java.util.Scanner;

public class RecupForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//print even numbers from 20 to 1
		for(int i=20; i>=1; i-=2) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		System.out.println("If cond inside of loop");
		for(int i=20; i>=1;i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("-----------------------");
		Scanner input=new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.println("Please write a name");
			String name=input.nextLine();
			System.out.println("Good afternoon "+name);
			System.out.println("----------------");
		}
	}

}
