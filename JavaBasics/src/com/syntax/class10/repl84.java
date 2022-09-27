package com.syntax.class10;

public class repl84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program that prints the total number of elements that are negative AND odd
		int[][] arr= {
				{-8,77,12,33,-5},
				{30, -4,-7,43,12}
		};
		int size=0;
		for(int[] num:arr) {
			for(int values:num) {
				if(values<0 && values%2==-1) {
					int[] odd= {values};
					size+=odd.length;
				}
			}
		}
		System.out.println(size);
	}

}
