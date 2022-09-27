package com.syntax.project;

public class Task3Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2D array of integer values. Print the sum of
		//all number
int[][] arr= {
		{20,25,45,88,233},
		{45,55,898,2,10}
		
	};
int sum=0;
for(int i=0; i<arr.length; i++) {
	for(int j=0; j<arr[i].length; j++){
		sum=sum+arr[i][j];}
	}
System.out.println("The sum of all numbers are "+sum);
}
	}

	


