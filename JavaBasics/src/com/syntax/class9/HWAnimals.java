package com.syntax.class9;

public class HWAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * *Create an array of animals and store 5 elements into it.
 *  Using 2 different loops print all elements from the array.
 */
		String[] animals= {"cat", "dog", "rabbit", "fox","parrot"};
		for(String allAnimals:animals) {
			System.out.println(allAnimals);
		}
		System.out.println();
		//another way;
		for(int i=0; i<animals.length;i++) {
			System.out.println(animals[i]);
		}
	}

}
