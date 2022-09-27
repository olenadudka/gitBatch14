package com.syntax.project;

import java.util.Scanner;

public class SumScannerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);

System.out.println("Enter number of elements in array");
int size=in.nextInt();
int myArray[]=new int[size];
int sum=0;
System.out.println("Enter "+size+" numbers of array");
for(int i=0; i<size; i++) {
	myArray[i]=in.nextInt();
	sum=sum+myArray[i];
}
System.out.println("Sum of all elements of array is "+sum);

}}
