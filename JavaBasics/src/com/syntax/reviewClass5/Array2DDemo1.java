package com.syntax.reviewClass5;

public class Array2DDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] individualsInRoom1=new String[] {"Sabej", "Shah","Mina"};
String[] individualsInRoom2=new String[] {"Roman", "Mina"};
String[] individualsInRoom3=new String[] {"Asad", "Priyasri","Ali"};


//an 2D aray that will store 3 single d arrays
String[][] rooms=new String[3][];

rooms[0]=individualsInRoom1;
rooms[1]=individualsInRoom2;
rooms[2]=individualsInRoom3;
System.out.println(rooms[1][1]);
System.out.println(rooms[2][2]);
	}

}
