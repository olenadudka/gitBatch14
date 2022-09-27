package com.syntax.class13;

public class ClassTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create a string that will hold a sentense. Write a program to get a new String without any spaces
		
		String str="I like to learn Java";
		String noSpaces=str.replaceAll(" ", "");
		System.out.println(noSpaces);
	}

}
