package SolvingProjectTasks;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * *Write a java program to check whether a given
number is prime or not?
 */
		int num=13
				;
		boolean isPrime=true;
		if(num>1) {
			for(int i=2; i<num; i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		if(isPrime) {
			System.out.println(num+" is Prime");
		}else {
			System.out.println(num+" is not prime");
		}
	}

}
