package com.review.class2;

public class IfElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*if we need one otcome based on if condition we use if 
		 * if the outcomes are 2 we use if else
		 * if outcomes are more than 2 we use if else if
		 */
		int number=12;
		if(number>0) 
		{System.out.println("number is positive");}
		if(number<0)
		{System.out.println("Number is negative");}
		if (number==0) 
		{
			System.out.println("Number is 0");}

		
		
/********************************************When we need to use multiple condition, use else if*/
		
		if(number>0) 
		{
			System.out.println("number is positive");
			}
		else if(number<0)
		{
			System.out.println("Number is negative");}
		else 
		{
			System.out.println("Number is 0");
			}

		
		
	}

}
