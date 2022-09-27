package com.syntax.reviewClass4;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///  9 5 1
		for (int i=9; i>=1; i-=4) {
			System.out.println(i);
		}
		///1 3 7 9
		for(int i=1;i<=9; i+=2) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}

}
