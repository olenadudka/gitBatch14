package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="I love java programming";

/*
 * charAt returns us the character at a specific index
 */
System.out.println(str.charAt(0));
for(int i=0; i<str.length(); i++) {
	if(!(str.charAt(i)==' ')){
		System.out.print(str.charAt(i));
	}
	}
	
	}

}
