package com.syntax.project;

public class DublicateElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a java program to printout dublicate elements from an array of strings
		String[] names= { "Olena", "Alena", "Daria","Daria", "Asel", "Olena", "Timur"};
		
		for( int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Dublicate elements are "+names[j]);
				}
			}
				
			}
				
			}
		

}
