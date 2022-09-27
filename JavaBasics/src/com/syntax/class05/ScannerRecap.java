package com.syntax.class05;

import java.util.Scanner;

public class ScannerRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//windows ctrl+shift+o, for mac cmd+shift+o
		int i=10;
String str="Hello";
Scanner input=new Scanner(System.in);
System.out.println("Please enter your name");
//to capture different values we use diff options
String name=input.next();  //capturing string

System.out.println("Nice to meet you "+name);
System.out.println("How old are you "+name);
int age=input.nextInt();  //capt int
System.out.println(name+ "  is "+age+" years old ");
System.out.println("How much money do you have "+name);
double money=input.nextDouble();
System.out.println(name+" has "+money);
System.out.println(name+" what is your grade");
char grade=input.next().charAt(0);
System.out.println(name+" has grade "+grade);
System.out.println("Please enter another name");
name=input.next();
System.out.println("New name is "+name);
	}

}
