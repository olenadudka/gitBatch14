package class13;

import java.util.Scanner;

public class Repl95 {
    public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);
    String str=scan.nextLine();
    String cutted=str.substring(0,3);
    System.out.println("The first 3 letters of "+str+ " is "+cutted);
}
}