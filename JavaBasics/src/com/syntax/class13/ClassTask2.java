package com.syntax.class13;

public class ClassTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Create a String that should be combination of letters, numbers and special characters.
 *  Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
 */
	String str="jfgfgjGGG6788&--^%677hj&&";
	String str2=str.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(str2);
	System.out.println(str2.length());
	}

}
