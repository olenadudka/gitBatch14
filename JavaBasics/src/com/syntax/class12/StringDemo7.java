package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str="I am always confused";
	System.out.println(str.indexOf("a"));
	System.out.println(str.indexOf("s"));
System.out.println(str.indexOf(" "));
//substring gives you smaller string from a String , we can start the starting part to this method 
//and it will return us the subString from the index
System.out.println(str.substring(2));
System.out.println(str.substring(5));

System.out.println(str.substring(5,11));


}}
