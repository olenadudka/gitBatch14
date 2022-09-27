package com.syntax.class13;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="fljdsfhgdhJJJJ^*111111()*&&";
System.out.println(str.replaceAll("[0-9]", "@"));
System.out.println(str.replaceAll("[A-Z]", ""));
System.out.println(str.replaceAll("[^A-Z]", "")); //remove everything but NOT A-Z, sign ^ means not
System.out.println(str.replaceAll("[A-Za-z]", ""));
	}
	

}
