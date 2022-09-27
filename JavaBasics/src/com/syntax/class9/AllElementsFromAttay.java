package com.syntax.class9;

public class AllElementsFromAttay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] iceCream= {"vanilla", "chocolate", "pistashio","kulfi", "mango"};
System.out.println(iceCream[0]);

System.out.println("----------");
// how to get all values?
for(int i=0; i<iceCream.length; i++) {
	System.out.println(iceCream[i]);
}
System.out.println("---------------");
char [] letters= {'A','B', 'C', 'D','F'};
for(int i=0; i<letters.length; i++) {
	System.out.print(letters[i]+" ");
}
	}

}
