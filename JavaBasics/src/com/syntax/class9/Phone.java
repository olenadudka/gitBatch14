package com.syntax.class9;

public class Phone {
/*Create class Phone. C
	*Create 3 Objects of it: iPhone, Pixel,Samsung with spesific atributes and behaviours
	*/
	
	String make;
	String model;
	String color;
	int year;
	int storage;
	
	void makeCall() {
		System.out.println(" Making a call using "+model);
	}
	void takePictures() {
		System.out.println("Taking picture with "+model);
	}
	void browseInternet() {
		System.out.println("Browsing the internet using "+model);
	}
}
