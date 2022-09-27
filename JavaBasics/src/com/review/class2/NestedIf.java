package com.review.class2;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Nested if conditions which are dependent on each other
 * if outer cond is not true, inner condition is never check
 * inner condition is only check when outer condition is passed
 */
		int money=12;
		if (money>10) {
			System.out.println("Lets buy some eggs");
			int noOfEggs=2;
			if(noOfEggs>0) {
				System.out.println("Lets boil the eggs");
			}
		}
	}

}
