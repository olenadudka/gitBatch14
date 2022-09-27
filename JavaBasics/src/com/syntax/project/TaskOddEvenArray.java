package com.syntax.project;

public class TaskOddEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//. Create a 2D array or integer type where you will store
		// odd and even numbers. Develop a program which will
		// identify/print the even numbers only
		
		int [][] arr= {
				{5,25,44,78,33},
				{23,88,2,4,13}
		};
		for(int[] rows:arr) {
			for(int num:rows) {
				if(num%2==0) {
					int even=num;
					System.out.print(even+" ");
					
	}

}
}}}