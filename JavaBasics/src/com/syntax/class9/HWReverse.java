package com.syntax.class9;

public class HWReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array to store char values and then print those 
		//in reverse order
		char[] letters= {'T','R','A','M','S'};
		for(int i=letters.length-1; i>=0; i--) {
			System.out.print(letters[i]);
		}
	}

}
