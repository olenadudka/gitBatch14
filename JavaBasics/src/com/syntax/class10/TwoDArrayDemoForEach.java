package com.syntax.class10;

public class TwoDArrayDemoForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr= {

                {"Yusuf", "Hamza", "Adam", "John"},
                {"A", "B", "C", "D"}
        };
		for(String[] singleArray:arr) { //loops over 1d or single array
			for(String el:singleArray) { //loops over each element of the 1st array
				
				System.out.print(el+' ');
			}
			System.out.println();
		}
		System.out.println("------------------------");
	}

}
