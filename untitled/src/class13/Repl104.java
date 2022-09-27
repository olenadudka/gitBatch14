package class13;

import java.util.Scanner;

public class Repl104 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] names=new String[5];
        for(int i=0; i<5; i++){
            names[i]=scan.nextLine();
            System.out.println(names[i].substring(0,3));
        }
    }
}
