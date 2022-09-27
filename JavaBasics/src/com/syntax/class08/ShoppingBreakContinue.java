package com.syntax.class08;

import java.util.Scanner;

public class ShoppingBreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Task 2: Write a program to ask a user to enter item they want to buy and the price of that item. 
 // Every time user enters money, accumulate the amount and tell the user how much is left to pay off. 
 // If user give more money program should return a change. Whenever user done with payments program should say "Thank you for shopping!"
  //You do not have permission to send messages in this channel.

 Scanner scan=new Scanner(System.in);
 System.out.println("What would you like to buy?");
 String item=scan.nextLine();

 System.out.println("What is the price of the itemy?");
 double price=scan.nextDouble();
 double money;
 double total = 0;
 
 do {
	 System.out.println("How much money do you have?");
	 money=scan.nextDouble();
	 total+=money; //accumulate all money
	 if(total<price) {
		double need =price-total;
		
		 System.out.println("You need to pay more "+need);
	 }else if(total>price) {
		 double change=total-money;
		 System.out.println("Here is your change "+change);
		 break;
	 }
 
 
 }while(total!=price);
 System.out.println("Thank you for shopping");

}
}