package com.syntax.reviewClass3;

public class LogicalOperator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double savings=200000;
	boolean freeTime=true;
	String season="summer";
	
	
	if(savings>100000 &&freeTime&& season.equals("summer")) {
		System.out.println("Lets go to Bora Bora");
	}else {
		System.out.println("I need time and money");
	}
		
	}

}
