package com.syntax.class08;

public class ContinueKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<5;i++) {
	if(i==3) {
		continue;
	}
	System.out.print(i);
	System.out.println();
	
}
//I want to print numbers from 1 to 20 except number 6,7,8
for(int i=1; i<=20; i++) {
	if(i==3 ||i==7 ||i==11) {
		continue;
	}
	System.out.print(i+" ");
}
	}

}
