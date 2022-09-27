package com.syntax.class07;

import java.util.Scanner;

public class Task6Coffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//6. Declare a variable to store a price for a coffee. Ask the user to pay for a coffee. Keep asking to pay 
		//for coffee until the user enters the EXACT amount . If the user gives more than coffee price --> ask them
	//	to give less, if the user gives less money then ask to give more. Once user give EXACT amount print “Please enjoy your coffee
Scanner scan=new Scanner(System.in);
double price=4.00;
double ammount;
do {
	System.out.println("Please pay for your coffee");
	ammount=scan.nextDouble();
	if(ammount>price) {
		System.out.println("Please give less");
		
	}else if(ammount<price) {
		System.out.println("Please give more money");
	}
}while (ammount!=price);
System.out.println("Enjoy your coffee");
}}