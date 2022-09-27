package com.syntax.class10;

import java.util.Scanner;

public class repl77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		  int[] myArray=new int[5];
		  for(int i=0; i<myArray.length; i++){
		    myArray[i]=scan.nextInt();
		  }
		  for(int i=(myArray.length-1); i>=0; i--){
		 
		System.out.println(myArray[i]);}

}}
