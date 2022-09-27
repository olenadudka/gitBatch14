package com.syntax.class9;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {5,78,99,1,4};
int smallest=arr[0];
for(int i=0; i<arr.length; i++) {
	if(arr[i]<smallest) {
		smallest=arr[i]; }}
System.out.println(smallest);
	
	}

}
