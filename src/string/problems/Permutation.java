package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {


    public static void listPermutations(String pre, String word){
        int length =word.length();
        if(length==0){
            System.out.println(pre);
        }else{
            for(int i =0; i<length; i++){
                listPermutations(pre + word.charAt(i),word.substring(0,i)+ word.substring(i+1,length));
            }
        }
    }

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        listPermutations("","ABC");



    }
}
