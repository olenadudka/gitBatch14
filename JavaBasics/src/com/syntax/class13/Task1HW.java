package com.syntax.class13;

public class Task1HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * *Create a String and if the String is not empty perform the following: 
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
 */
		
		String str="Java is love";
		int length=str.length();
		if(!str.isEmpty()&&str.length()%2!=0&&str.length()>=3) {
			int middleIndex=str.length()/2;
			System.out.println(str.charAt(middleIndex));
		}
	}

}
