package com.syntax.class06;

import java.util.Scanner;

public class enchanceCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the time using 24 hours format");
		int time = scan.nextInt();
		
		
		String timeOfTheDay;
		if (time >= 1 && time <= 11) {
			timeOfTheDay="Morning";
		} else if (time >= 12 && time <= 15) {
			timeOfTheDay="Afternoon";
		} else if (time >= 16 && time <= 20) {
			timeOfTheDay="Evening";
		} else if (time >= 21 && time <= 24) {
			timeOfTheDay="Night";
		}else {
			System.out.println("Wron number is entered");
			timeOfTheDay="Invalid";
		}
		System.out.println(timeOfTheDay);
	}

}
