package com.syntax.class11;

public class Person {

	String name;
int age;
double weight;
boolean isFunny;
double height;
boolean losingHairs;

void study() {
	if(name.equals("Anna")) {
		System.out.println("I study hard");
	}else if(name.equals("Roman")){
			System.out.println("I will keep on deleting messages and will not let anyone to study");
		}else {
			System.out.println("I will try to study but things not make sence yet");
		}
	}
public static void main (String[] args) {
	Person person1=new Person();
	person1.name="Anna";
	person1.study();
	System.out.println("********************");
	Person person2=new Person();
	person2.name="Yusuf";
	person2.study();
}
			

	}


