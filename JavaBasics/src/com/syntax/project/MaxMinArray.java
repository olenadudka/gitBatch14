package com.syntax.project;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Task9 Maximum and minimum numbers of Array
		int[] numbers= {4,67,88,90,34};
		int maximum=numbers[0];
		int minimum=numbers[0];
			for(int i=0; i<numbers.length; i++) {
				if(numbers[i]>maximum) {
					maximum=numbers[i];}}
				
				System.out.println("maximum number in array is "+maximum);
				for(int i=0; i<numbers.length; i++) {
					if(numbers[i]<minimum) {
						minimum=numbers[i];
					}
				}
				System.out.println("Minimum number in array is "+minimum);
				
	}}
