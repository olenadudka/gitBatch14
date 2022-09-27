package com.syntax.class11;

public class Student {
	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	void study() {
		System.out.println("Student is studing");
	}
	void deleteMesseges() {
		System.out.println("Deleting messages from Discord");
	}
void eat(){
	System.out.println("Eating pizzzzza...");
}


public static void main(String[] args) {
	//new Student()=> Creates the object of Student class
	Student friadoonObject=new Student();
	friadoonObject.name="Friadoon";
	friadoonObject.id="123";
	friadoonObject.age=22;
	
	
	System.out.println(friadoonObject.name);
	System.out.println(friadoonObject.age);
	friadoonObject.deleteMesseges();
	System.out.println("________________");
	
	
	Student student2=new Student();
	student2.name="Asma";
	student2.age=16;
	student2.weight=30;
	student2.gender='F';
	System.out.println(student2.name);
	student2.eat();
}
}
