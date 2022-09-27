package com.review.class2;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
short largerBox=129;
byte smallerBox=(byte)largerBox;
System.out.println(smallerBox);  //explicit as we can'tfeet 129 in byte we will get wrong result

int largerBox1=129;
short smallerBox2=(short)largerBox1;
System.out.println(smallerBox2); 

//IMPLICIT/WIDENING/aUTOMATIC
short smallerBox3=45;
long largerBox3=smallerBox;
	}

}
