package SolvingProjectTasks;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Write a program to swap 2 numbers without a
temporary variable?
 */
		int a=10;
		int b=20;
		
		a=a+b;  //a=30
		b=a-b;
		a=a-b;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

}
