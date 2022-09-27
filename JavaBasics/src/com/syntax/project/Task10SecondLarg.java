package com.syntax.project;

public class Task10SecondLarg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * *10. Write a java program to find the second largest
number in the array
 */
		int[] arr= {5,55,89,56,2,41};
		int largest=0;
		
		for(int num:arr) {
			if(num<largest) {
				largest=num;}
	
			}
		int secLargest=0;
		for(int num:arr) {
			if(num==largest) {
				continue;
			}
			else if(num>secLargest) {
				secLargest=num;
			}
		}
		System.out.println(secLargest);
		}
		
	}


