package com.syntax.class4;

import java.util.Scanner;

public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("What loan amound do you need?");
int loanAmmount=scanner.nextInt();
if (loanAmmount<=200000)
	System.out.println("I would lend the money");
else 
{
	System.out.println("I will reject the loan");
}
		
		
	}

}
