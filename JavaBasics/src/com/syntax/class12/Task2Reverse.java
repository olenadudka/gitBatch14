package com.syntax.class12;

public class Task2Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a String and print it in reverse order (Sunday → yadnuS).
		String str="Sunday";
		char[] toCharArray=str.toCharArray();
		
		
		for(int i=toCharArray.length-1; i>=0; i--) {
			System.out.print(toCharArray[i]);
		}
	}

}
