package class13;

import java.util.Scanner;

public class repl103 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        for(int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i)+" ");
        }
    }
}
