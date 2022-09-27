package com.syntax.class05;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //to formate your code use ctrl shift F
		boolean allergy = true;
		String allergyType = "Peanut";
		if (allergy) {
			System.out.println("Lets check what allergy you have");
			if (allergyType.equals("Pollen")) {
				System.out.println("Try to stay indoors");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Stay away from peanuts");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy");
			} else {
				System.out.println("We need some test");
			}
		} else {
			System.out.println("You are lucky");
		}
	}

}
