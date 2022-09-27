package com.review.class2;

import java.util.Scanner;

public class ScanDemo {
	/* nextLine is special method than can capture spaces and enters as well
	 * when we use any method like nextInt() or nextBoolean() and after that if we use
	 * nextLine() we need to discard that enter b using an extra nextLine() call
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner=new Scanner(System.in);

	        System.out.println("Pelease Enter your age");
	        int age=scanner.nextInt();

	        System.out.println("Pelease Enter your name");
	        scanner.nextLine();
	        String name=scanner.nextLine();
   //we need to use this extra line. when we use some nextLine not in the beginning

	        System.out.println(name+" is "+age+" years old");


	    }
	

}
