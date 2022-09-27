package com.syntax.class12;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Create a String and if the String is not empty perform the following: 
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
 */
		String str="windows";
		int length=str.length();
		if(!str.isEmpty()) {
			if(str.length()>3 && length%2==1) {
				
				System.out.println(str.charAt(length/2));
			}
			
		}
	}

}
