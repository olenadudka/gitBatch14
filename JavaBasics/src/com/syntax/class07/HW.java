package com.syntax.class07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter from what country are you from?");
		String country=scan.nextLine();
		String language;
		switch (country.toLowerCase()) {   //to make it not sensetive to case
		case "usa":
			language="English";
			break;
		case "ukraine":
			language="Ukrainian";
			break;
		case "mexico":
			language="Spanish";
			break;
		case "russia":
			language="Russian";
			break;
		case "france":
			language="French";
			break;
		case "germany":
			language="German";
			break;
			default:
				language="Unknown";
				break;
			
		}
		System.out.println("You are from "+country+" and you speak "+language);
		
		
	}
	}


