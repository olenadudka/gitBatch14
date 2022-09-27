package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=" i love java ";
System.out.println(str);

/*
 * remove the spaces before and after the String but not the ones which are present in between
 */
System.out.println(str.trim());
/*
 * startsWith method checks if a String starts with a specific letter or word
 * endWith check if a String ends with the specific letter or word
 * contains check if a String contains a specific letter or word
 */

String str2="Java is Very easy";
System.out.println(str2.startsWith("Java"));
System.out.println(str2.endsWith("y"));
System.out.println(str2.contains("very"));

//Method chaining us call multiple methods on a single line one method after other
System.out.println(str2.toLowerCase().contains("very"));
	}

}
