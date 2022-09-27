package com.syntax.class10;

import java.util.Scanner;

public class Repl76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		   String[] day=new String[7];
		   System.out.println("Please enter day 1 of the week");
		   day[0]=scan.nextLine();
		   System.out.println("Please enter day 2 of the week");
		   day[1]=scan.nextLine();
		   System.out.println("Please enter day 3 of the week");
		   day[2]=scan.nextLine();
		   System.out.println("Please enter day 4 of the week");
		   day[3]=scan.nextLine();
		   System.out.println("Please enter day 5 of the week");
		   day[4]=scan.nextLine();
		   System.out.println("Please enter day 6 of the week");
		   day[5]=scan.nextLine();
		   System.out.println("Please enter day 7 of the week");
		   day[6]=scan.nextLine();
		   for(int i=0;i<day.length; i++) {
			   System.out.println(day[i]);
			   
		   }
		 }
	}


