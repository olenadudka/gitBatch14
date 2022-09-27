package com.syntax.class10;

public class TwoDArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] countries= {
		{"Usa","Canada"}, // 1st array with index 0
		{"Peu", "Brazil", "Colombia", "Equador"}, //2nd array with index 1
		{"Ethiopia","Egypt","Kenya"},
		{"Germany","Turkiye","Moldova","Ukraine"},
		{"Kazakhstan", "Afghanistan","Korea"}
};
System.out.println(countries.length); //5- 5 arrays inside 2d arrays or rows
int elOf1arr=countries[0].length;
System.out.println(elOf1arr); //2

int elOf2arr=countries[2].length; //number of elements of 2nd row
System.out.println(elOf2arr);


System.out.println("-----getting all values from 2d array using regular loop-------------");

for(int r=0; r<countries.length; r++) {  //loops over rows
	for(int c=0; c<countries[r].length; c++ ) {
		System.out.print(countries[r][c]+" ");
	}
	System.out.println();
	
}

System.out.println("------getting all values from 2d array using for each loop--------");
System.out.println("Another way");
for(String[] country:countries) {
	for(String c:country) {
		System.out.print(c+" ");
	}
	System.out.println();
}
	}

}
