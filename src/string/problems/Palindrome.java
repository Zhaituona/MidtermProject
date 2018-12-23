package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        // 1. input String , take the user input
        String reverse = "";//  make sure this is empty String
        System.out.println("Please Enter input String ");
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        // 2.find a reverse of String

        for( int i =original.length()-1;i>=0; i--){// it means take it from the last index
            reverse = reverse +original.charAt(i); // take the original String and putin to the empty String
            //from back , cause reverse will be back .
        }
        // 3.check original String and reverse String same or not
        if(original.equals(reverse)){
            System.out.println("The given String is palindrome");
        }else{
            System.out.println("The given String is not palindrome");
        }

    }
}



