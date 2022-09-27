package com.syntax.reviewClass4;

import java.util.Scanner;

public class ForLoopDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the number");
int i=scanner.nextInt();
while(i!=10) {
	System.out.println(i);
	i=scanner.nextInt();
}
System.out.println("--------------");
//all the loops are interchangeable but sometimes using one type of loop can make your code cleaner and understand
for(int k=0; k!=10; k++) {
	System.out.println(i);
	i=scanner.nextInt();
}
	}

}
