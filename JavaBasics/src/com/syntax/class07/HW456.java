package com.syntax.class07;

import java.util.Scanner;

public class HW456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//4. Print odd numbers between 20 and 50 (2 ways)
		
		for(int a=21; a<=50; a+=2) {
			System.out.print(a+" ");
		}
		System.out.println("------------------");
		
		int b=20;
		while (b<=50) {
			if(b%2==1) {
			System.out.print(b+" ");
			
		}
			b++;
	}
		System.out.println("--------------------------");
		
		//5. Prompt the user to ask the name 3 times and print "Good afternoon +name...
		Scanner scan=new Scanner(System.in);
		for(int c=1; c<=3; c++) {
			System.out.println("Please enter your name");
			String name=scan.nextLine();
			System.out.println("Good afternoon "+name );
		}
		}

}
