package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        // Factorial of 5
        // Using Iteration
        int n = 5;// using for 5
        int result = 1;// start from 1
        for(int i =1; i<=n; i++){
            result = result * i;
            System.out.println("The Factorial of "+ i + ": " + result);
        }
        System.out.println("The Factorial of 5 is : "  + result );// we also can put inside the loop
        // it will show what happend inside the loop
       // System.out.println("The factorial of 5 is : "  + factorial(10));
        System.out.println("The factorial of 5 is : "  + factorial(5));

    }
    // Factorial 5
    //Using Recursion

    // create a method ,we can call we want to use .
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }



    }
}


