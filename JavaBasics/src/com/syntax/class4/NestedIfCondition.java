package com.syntax.class4;

public class NestedIfCondition {

	public static void main(String[] args) {
		int time=9;
		String day="Monday"; //String is non primitive we cant use ==, we have to use .equals
		if(day.equals("Monday")) { /*it calls outer if condition it is true then only inner condition will be checked
		*if its false nothing from inner if condition will be executed it is like a main door
		*if main door is close, we cant enter building
		*/
			if(time>7)
		{
			System.out.println("Lets go to office");
		}
			if(time<6) {
				System.out.println("Lets sleep more");
			}
	}
	}
}
