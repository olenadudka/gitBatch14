package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Shah";
		if(str.equals("shah")) {
			System.out.println("I found it");
		}
		
		/*
		 * equals checks if 2 Strings are exactly the same with exact same case
		 * equalsIgnoreCase checks if 2 strings are exactly the same but does not care about the
		 * case of letters
		 */
		if(str.equalsIgnoreCase("shah")){
			System.out.println("I found it with equalsIgnoreCase");
		}
	}

}
