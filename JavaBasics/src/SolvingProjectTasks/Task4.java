package SolvingProjectTasks;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * * Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.
		 */
int[][] arr= {
		{14,23,67,44},
		{23,30,54},
		{21,30}
};
for(int[] ar:arr) {
	for(int num:ar) {
		if(num%2==0) {
			System.out.println(num);
		}
	}
}
	}

}
