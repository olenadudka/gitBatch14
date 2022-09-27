package com.syntax.reviewClass5;

import java.util.Arrays;

public class ArraysDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creates an array, store elements
		//then with help another array adds all the elements.
	int size=10;
	int[] arr=new int[10];
	int start=11;
	
	for(int i=0; i<arr.length; i++) {
		
		arr[i]=start;
		start--;
	}
	System.out.println(Arrays.toString(arr));
	int sum=0;
	for(int num:arr) {
		sum=sum+num;  //or sum+=num
		
	}
	System.out.println(sum);

}}
