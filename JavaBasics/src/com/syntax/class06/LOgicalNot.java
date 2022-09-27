package com.syntax.class06;

public class LOgicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean boo=!true;
System.out.println(boo);

boolean boo1=!false;
System.out.println(boo1);

boolean rain=false;
if(!rain) {
	System.out.println("I will go for walk");
}


String day="Sunday";
if(!day.equals("Sunday")) {
	System.out.println("Today is not Sunday");
}




System.out.println("--------------------");

boolean checkboxSelected=true;
if(!checkboxSelected)  {
	System.out.println("I will click and select it");
}
	}

}
