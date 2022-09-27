package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//from the range of 1 to 50 please find the sum of all even and all odd numbers
		
		//Create a secret number and let user guess the secret number
		//once user guessed your secret number ->program says you won
		
		int sum1 = 0;
		for(int i=1; i<=50; i+=2) {
			sum1+=i;}
			System.out.println(sum1);
		int sum2=0;
		for(int b=2; b<=50; b+=2) {
			sum2+=b;
		}
		System.out.println(sum2);
		
		
		System.out.println();
		System.out.println("------------------");
		Scanner scan=new Scanner(System.in);
		int secret=5;
		int answer;
		
		do {
			System.out.println("Please gues a number");
			 answer=scan.nextInt();
		}while(answer!=secret); {
			System.out.println("You won!!!");
			
		}
		System.out.println("----------------");
		int sumOdd=0;
		int sumEven=0;
		for(int a=0; a<=50; a++) {
			if(a%2==0) {
				sumEven+=a;
			}else {
				sumOdd+=a;
			}
		}
		System.out.println("summ of odd numbers = "+sumOdd);
		System.out.println("summ of even numbers =" +sumEven);
		
	}
		
	}


