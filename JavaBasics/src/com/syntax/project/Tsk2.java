package com.syntax.project;

import java.util.Scanner;

public class Tsk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 	Using Scanner create an array of countries. When an
	**	array is created, retrieve all values from it and while
	*	retrieving those values print capital for each country.
		*(use 2 different loops).
		**/
		Scanner scan=new Scanner(System.in);
		String[][] countries= {
				{"France", "Ukraine", "Russia", "England", "Spain","Italy"},
				{"London", "Kyiv", "Moscow", "London", "Madrid", "Rome"}
		};
		System.out.println("Please enter the country");
		
			for(int j=0; j<countries[0].length; j++) {
		String input=scan.next();
		int i=0;
		for(String country:countries[0]) {
			if(input.equals(country)) {
				System.out.println("The cpital of "+country+" is "+countries[1][i]);
			}
			i++;
		}
	}}

}
