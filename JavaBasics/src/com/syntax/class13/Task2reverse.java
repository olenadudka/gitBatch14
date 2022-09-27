package com.syntax.class13;

public class Task2reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Create a String and print in reverse
		String str="Sunday";
		for(int i=5; i>=0;i--) {
			System.out.print(str.charAt(i));
			
			System.out.println();
		}
		
		char[] charArr=str.toCharArray();
		for(int i=charArr.length-1; i>=0; i--) {
			System.out.print(charArr[i]);
		}
	}

}
