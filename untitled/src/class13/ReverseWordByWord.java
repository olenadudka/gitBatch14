package class13;

public class ReverseWordByWord {
    public static void main(String[] args) {
     //How would you reverse a String word by word? for example
        //        // input=>This is sentence i want to reverse
        //        // output=>sihT si ecnetnes i tnaw ot esrever

        String str="Today is a good day";
        String[] arr=str.split(" ");

        for(int i=0; i<arr.length; i++){
            for(int j=arr[i].length()-1; j>=0; j--){
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
