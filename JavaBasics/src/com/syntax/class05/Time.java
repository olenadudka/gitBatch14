package com.syntax.class05;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		/*
		 * Based on the given time define: if hour is between 1-11 --> Morning if hour
		 * between 12-15 --> Afternoon if hour between 16-20 --> Evening if hour between
		 * 21-24 --> Night
		 */
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the time using 24 hours format");
		int time = scan.nextInt();
		if (time >= 1 && time <= 11) {
			System.out.println("Morning");
		} else if (time >= 12 && time <= 15) {
			System.out.println("Afternoon");
		} else if (time >= 16 && time <= 20) {
			System.out.println("Evening");
		} else if (time >= 21 && time <= 24) {
			System.out.println("Night");
		}

	}

}
