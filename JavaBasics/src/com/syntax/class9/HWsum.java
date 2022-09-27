package com.syntax.class9;

public class HWsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * *Create an array on integers and calculate the sum of all elements in 
 * an array
 */
		int[] numbers= {5,7,9,11,67,12};
		int sum = 0;
		for(int i=0; i<numbers.length; i++)
			sum+=numbers[i];
		System.out.println(sum);
	}

}
