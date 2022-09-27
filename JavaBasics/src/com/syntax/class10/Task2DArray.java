package com.syntax.class10;

public class Task2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] big=new String[2][4];
        big[0][0]="Mr";
        big[0][1]="Mrs";
        big[0][2]="Ms";
        big[0][3]="Miss";

        big[1][0]="Smith";
        big[1][1]="Jordan";
        big[1][2]="Jackson";
        big[1][3]="Obama";

        System.out.print(big[0][1]+" "+big[1][0]+" ");
        System.out.print(big[0][0]+" "+big[1][3]+" ");
        System.out.print(big[0][2]+" "+big[1][2]+" ");
        System.out.print(big[0][3]+" "+big[1][1]+" ");
        
        
        
	}
}
