package com.syntax.class02;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=5.44;
		double b=1.22;
		double sum=a+b;
		double sub=a-b;
		double multipl=a*b;
		double div=a/b;
		
		System.out.println("The addition of 2 numbers " +a +" and "+b+" is equal to "+sum);
		System.out.println("The extraction of 2 numbers "+a+" and "+b+ " is equal to "+sub);
		System.out.println("The multiple of 2 numbers "+a+ " and "+b+ "is equal to "+multipl);
		System.out.println("The dividing of 2 numbers "+a+" and "+b+"is equal to"+div);
		
		double side=3.9;
		double square=side*side;
		System.out.println("The square of the "+side+" is " +square);

		int w=5;
		int h=8;
		int perim=2*(w+h);
		int s=w*h;
		System.out.println("The perimeter of a rectangle with width "+w+" and height " +h+ " is equal to "+perim+ " and the area is "+s);
		
	}

}
