package com.syntax.class10;

import java.util.Arrays;
import java.util.Scanner;

public class repl78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);


int[] arr=new int[5];
for(int i=0; i<arr.length; i++){
	arr[i]=scan.nextInt();
	
	}
for(int i=0; i<5;i++) {
	int mult=10*arr[i];
	System.out.println(mult);
}


}

	}


