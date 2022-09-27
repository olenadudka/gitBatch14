package com.syntax.class9;

public class ArrayFixadSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] colors=new String[3];
colors[0]="White";
colors[1]="Pink";
colors[2]="Black";
//colors[3]="Yellow"; //ArrayIndexOutOfBoundsException: Index 3 
System.out.println(colors[3]);
	}

}
