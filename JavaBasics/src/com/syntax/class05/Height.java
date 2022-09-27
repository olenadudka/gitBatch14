package com.syntax.class05;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Prompt the user to enter person heights in inches. Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)
		 * 
		 */
Scanner scan=new Scanner(System.in);

System.out.println("Enter your height in inches");
int height=scan.nextInt();
if(height<60) {
	System.out.println("short");
} else if(height>=60 && height<=75) {
	System.out.println("Medium");
} else if (height>75){
	System.out.println("tall");
}
	}

}
