package com.syntax.class10;

public class HW1Recup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//From array of integer find the largesr
		int[] num= {10,20,30,40,50};
		int largestnum=num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i]>largestnum) {
				largestnum=num[i]; 
			}
		}System.out.println(largestnum);
		System.out.println("----------------------------");
		largestnum=num[0];
		for(int n:num) {
			if(n>largestnum) {
				largestnum=n;
			}
		}
		System.out.println(largestnum);
	}

}
