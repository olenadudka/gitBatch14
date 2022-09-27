package com.syntax.class12;

import java.util.Arrays;

public class StringDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * toCharArray will convert a String to an array of chars
		 */
String str="I love java programming";
char[] charArray=str.toCharArray();

System.out.println(charArray[5]);
System.out.println(Arrays.toString(charArray));

int counter=0;
for(char c:charArray) {
	if(c=='a') {
		counter++;
	}
}
System.out.println("letter i has appread "+counter+ " times");
	}

}
