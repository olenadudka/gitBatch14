package com.syntax.class07;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//print all numbers from 1 to 10
		int num=1;
		while (num<=10) {
			System.out.print(num+" ");
			num++;
		}
		
		
		System.out.println("___________________");
		//print all numbers from 10 to 25
		int a=10;
		while(a<=25) {
			
			System.out.print(a+" ");
			a++;}
			
			//print all numbers from 10 to 1
			int b=10;
			while(b>=1)
		{
			System.out.print(b);
			b--;
		}
			
			//print all numbers from 50 to 20
			//print all even numbers from 1 to 20
			System.out.println("___");
			int c=50;
			while (c>=20) {
				System.out.print(c+" ");
				c--;
			}
			
			System.out.println("-------------");
			int d=2;
			while (d<=20) {
				System.out.print(d+" ");
				d+=2;
			}
			
			System.out.println("-------");
			int i=2;
			while (i<=20) {
				if(i%2==0) {
					System.out.println(i+" ");
				}
				i++;
			}
	}}


