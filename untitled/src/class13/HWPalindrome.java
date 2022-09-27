package class13;

public class HWPalindrome {
    public static void main(String[] args) {



    //How would you check if String is palindrome or not? aba=> true
    //Abbc =>false
    String word="mom";

    String reverse="";
    for(int i=word.length()-1; i>=0; i--){
     reverse=reverse+word.charAt(i);}

    if(reverse.equals(word)){
            System.out.println("The word "+word+" is palindrome");
        }
    else{
        System.out.println("The word "+word+" is not palindrome");
    }
}}
