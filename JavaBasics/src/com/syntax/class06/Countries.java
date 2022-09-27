package com.syntax.class06;

import java.util.Scanner;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Ask user to enter their country and capture it. Once values are captured print which language user speaks.canner scan=
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter from what country are you from?");
		String country=scan.nextLine();
		String language;
		switch (country) {
		case "Usa":
			language="English";
			break;
		case "Ukraine":
			language="Ukrainian";
			break;
		case "Mexico":
			language="Spanish";
			break;
		case "Russia":
			language="Russian";
			break;
		case "France":
			language="French";
			break;
		case "Germany":
			language="German";
			break;
			default:
				language="Unknown";
				break;
			
		}
		System.out.println("You are from "+country+" and you speak "+language);
		
		
	}

}
