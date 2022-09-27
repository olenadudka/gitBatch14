package com.syntax.class10;

public class ExampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] week= {"Monday", "Sunday", "Tuesday", "Thursday", "Friday"};
//id day is Sunday ->it is a fun day
//otherwise - it is a boring day
for(String day:week) {
	if(day.equals("Sunday")){
			System.out.println(day+" is a fun day");
			}else {
				System.out.println(day+ " is a boring day");
			}

	
}
	}

}
