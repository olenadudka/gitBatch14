package com.syntax.class02;

public class NonrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is just 1 example of non primitive data types
		
		String name="Asma";
		
		String address="123 address street";
		
		String phone="123 4567 890";
String ages="17";   //anything you put inside "" -> become String
int age=17;

//ctrl+space -> auto completes the statement
//syso+ctrl+space
System.out.println(name);

// "My name is" + Asma
System.out.println("My name is "+ name);  //spaces is matter inside of ""

//Asma is 17
System.out.println(name + " is " + age);

String fruit="apple";
double price=1.99;
//The price of the apple is 1.99
System.out.println("The price of the " +fruit +" is " + price);
fruit="mango";
price=5.99;

System.out.println("The price of the " +fruit +" is " + price);

/*attach any value (int,double, boolean, char,String to String we use +
 * + next to the String acts as Concatenation
 */
	}

}
