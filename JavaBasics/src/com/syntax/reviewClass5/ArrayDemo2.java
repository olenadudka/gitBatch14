package com.syntax.reviewClass5;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] dresses=new String[] {"Pink dress", "coctail", "Summer dress", "Pensil dress"};
//last index is always size-1 because arrays index start from zero
System.out.println(dresses.length);
//Mostly this is how you will use array
for(int i=0; i<dresses.length; i++) {
	System.out.println("Let's try "+dresses[i]);
	
	
}
System.out.println("------------");
for(String dress:dresses) {
	System.out.println(dress);
}
//print all elements for array
System.out.println((Arrays.toString(dresses)));
	}

}
