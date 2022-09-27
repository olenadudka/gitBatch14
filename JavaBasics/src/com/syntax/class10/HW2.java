package com.syntax.class10;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Create an array to store char and print them on reverse order
 * 
 */
		char[] letters= {'A', 'D', 'F'};
		
		for(int i=letters.length-1; i>=0; i--) {
			System.out.print(letters[i]+" ");
		}
	}

}
