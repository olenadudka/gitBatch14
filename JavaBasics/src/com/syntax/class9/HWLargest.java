package com.syntax.class9;

public class HWLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//From an array of integer elements find the largest number.
int[] arr={6,78,99,66,44,54};
int largest = arr[0];
for(int i=0; i<arr.length; i++) {
	if(arr[i]>largest)
	{
		largest=arr[i];}}
	System.out.println(largest);


}}
