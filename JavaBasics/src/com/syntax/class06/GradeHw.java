package com.syntax.class06;

import java.util.Scanner;

public class GradeHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
 * 
 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your score for quizz");
		int quiz=scan.nextInt();
		System.out.println("Enter your mid term");
		int midTerm=scan.nextInt();
		System.out.println("Enter your final score");
		int finalScore=scan.nextInt();
		int average=(quiz+midTerm+finalScore)/3;
		String grade;
		
		if(average>=90 && average<=100 ) {
			grade="A";
					
		}else if (average>=90 && average<90) {
			grade="B";
		}else if(average>=50 && average<70) {
			grade="C";
		}else if(average<50 && average>0) {
			grade="F";
			
		}else {
			System.out.println("Enter valid number");
			grade="None";
		}
		System.out.println(grade);
		
	}

}
