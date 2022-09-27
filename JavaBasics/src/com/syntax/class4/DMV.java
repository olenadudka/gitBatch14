package com.syntax.class4;

import java.util.Scanner;

public class DMV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("What is your age?");
int age=scanner.nextInt();
if (age>=18)
{
	System.out.println("I will issue driver licence for you");
}
else
{
	System.out.println("You can get a learners permit");
}
	}

}
