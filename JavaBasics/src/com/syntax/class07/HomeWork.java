package com.syntax.class07;

public class HomeWork {
	public static void main(String [] args) {
		// Print numbers from 1 to 100 in 1 line with space
for(int a=1; a<=100; a++) {
	System.out.print(a+" ");
}

System.out.println("------------");


//2. Print numbers from 100 to 1
for(int a=100; a>=1; a--) {
	System.out.print(a+" ");
}
System.out.println("-----------------");
//3. Print even numbers from 20 to 1 (2 ways)
for ( int b=20; b>=1;b-=2) {
	System.out.print(b+ " ");
}
System.out.println("------------------");
   int d=20;
   while(d>=1) {
	   System.out.print(d+" ");
	   d-=2;
   }
    System.out.println("----------------");

}
}