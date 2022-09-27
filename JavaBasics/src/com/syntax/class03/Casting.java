package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * type casting=converting
		 * 
		 */
		byte box1=127; //smallest box 8 bits
		short box2=3333; // double the size of box1 in terms of bits 16 bits
		int box3=45454545; //32 bits, large box most commonly used 32 bits
		long box4=454545666; // larger box, 64 bits
		float box5=414564545; // larger
		double box6=45454545; //largest
		
		
		//int number=15.2; //we can't store the decimal number in the box of type int
		int number8=(int)15.2; //data type casting
		


		
		byte smallerBox=(byte)box2;
		//System.out.println(smallerBox); //we will have error
		short biggerBox=box1;
		long box7=box1; //we can do this because box 7 is larger than box 1
		//float box8=(float)box6; //as box 6 is larger it is double we need type casting to assign
		
		int box9=(int)box4;
		System.out.println(box9);

	}

}
