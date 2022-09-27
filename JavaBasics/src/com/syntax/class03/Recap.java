package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String concatination helps us combine a String with any primitive data type
		 */
		String firstName="Mina";
		String lastName="Henen";
		String fullName=firstName+" "+lastName; //adding a spase
		System.out.println(fullName);
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName="That street";
		String city="New York";
		String country="USA";
		String fullAddress=apartmentNo+" "+houseNo+" "+streetName+" "+city+" "+country;
		System.out.println(fullAddress);
		System.out.println("if we substract 10 from 5 we get="+10);
		String incompleteAddress=houseNo+city;
		String step1="if we substract 10 from 5 we get +"+10; //result in a String
		//it is not defined java does not understand what to do. when we ask her to substract a string from No it complains
		//String step2=step1-5;
		System.out.println("if we substract 10 from 5 we get ="+(10-5));

	}

}
