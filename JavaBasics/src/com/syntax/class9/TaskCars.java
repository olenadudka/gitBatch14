package com.syntax.class9;

public class TaskCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//. Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array.
		String[] cars={"Honda","Toyota","Mersedes","Infiniti","Jeep","BMW"};
		for(String car:cars) {
		System.out.println(car);}
		System.out.println("--------------------");
		 
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
