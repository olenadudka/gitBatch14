package class13;

import java.util.Scanner;

public class Repl101 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        for (int i = 0; i <= word.length(); i++) {
            if (i%2==0) {
                System.out.print(word.charAt(i));
            }
        }
    }}
