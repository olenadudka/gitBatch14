package com.syntax.class12;

public class StringDemo {

	public static void main(String[] args) {
		
		String str=new String("Java");  // same like line 8
		String name="Java";  //only works for String and Wrapper classes, simpler and shorter way provided by Java Creator
		//to make our life easier
		
		/*
		 * counts the number of characters in a string including a spaces
		 */
System.out.println(str.length());
if(name.length()>15) {
	System.out.println("Name can't be more than 15 characters");
}
	}

}
