package SolvingProjectTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*. Using Scanner create an array of countries. When an
*array is created, retrieve all values from it and while
*retrieving those values print capital for each country.
*(use 2 different loops).
 * 
 */
		 Scanner scanner=new Scanner(System.in);
	        System.out.println("Please enter how many countries you want to process");
	        int size=scanner.nextInt();
	        //two arrays one to store countries, other one to store capitals
	        String [] countries=new String[size];
	        String [] capitals=new String[size];
	        ////this is just to consume that extra enter that we will
	        //be getting from line 18
	        scanner.nextLine();  
	        for(int i=0;i<size;i++) {
	            System.out.println("Please Enter the country name");
	            countries[i]=scanner.nextLine();

	            System.out.println("Please Enter the capital for "+countries[i]);
	            capitals[i]=scanner.nextLine();
	        }

	        System.out.println(Arrays.toString(countries));
	        System.out.println(Arrays.toString(capitals));
	        
	        for(int i=0; i<size; i++) {
	       System.out.println("The "+countries[i]+" has the capital "+capitals[i]);
	        }


	    }

}
