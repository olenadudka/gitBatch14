package com.syntax.class4;

import java.util.Scanner;

public class CityTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create a Java program that will ask user to input city 
		 * and temperature. Your program should convert Fahrenheit into celsius and print 
		 * “The temperature is the city  is ” (edited)
		 */
		


		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your city?");
		String city=scanner.nextLine();
		System.out.println("What is the temperature outside?");
		
		double tempF=scanner.nextDouble();
		double tempC=(tempF-32)/1.8;
		System.out.println("The temperature in "+city+" is "+tempC);

	}

}
