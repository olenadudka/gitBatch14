package SolvingProjectTasks;

import java.util.Arrays;
import java.util.Scanner;

public class SolvingTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Using Scanner create an array of integer values.  calculate the sum of all stored
	//	elements in that array.We need to ask user about size of array 
		//and create an array of the size, then calculate the sum
		//of all stored elements in the array
		//the array is created, fill the array with numbers, 
		//ask the numbers of user.
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter the size of array");
int size=scanner.nextInt(); //ask user for number

int[] arr=new int[size];  //create array of the above size


for(int i=0; i<size; i++) {
	System.out.println("Please enter an int number");
	arr[i]=scanner.nextInt();
}
System.out.println(Arrays.toString(arr));
int sum=0;
for(int num:arr) {
	sum+=num;
}
System.out.println("Sum of all numbers from the Array is "+sum);
}
}