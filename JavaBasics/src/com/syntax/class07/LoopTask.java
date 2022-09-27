package com.syntax.class07;

public class LoopTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print numbers from 100 to 1
		//
int a=100;
while (a>=1) {
	System.out.print(a+" ");
	a--;
}

System.out.println("--------------------");
//Print even numbers from 20 to 100 
int b=20;
while (b<=100) {
	System.out.print(b+" ");
	b+=2;
}
	System.out.println("-------------Another way");
	int c=20;
	while (c<=100) {
		if(c%2==0){
			System.out.print(c+" ");
		}
		c++;
	}
	
	//Print only odd numbers from 100 to 1
	//(2 different ways)
	System.out.println("-----------------------");
	int d=99;
	
	
	while(d>=1) {
		System.out.print(d+ " ");
		d-=2;
	}
	
	System.out.println("__________________________________");
	int n=99;
	while(n>=1) {
		if(n%2==1) {
			System.out.print(n+" ");
		}
		n--;
	}
	}

}
