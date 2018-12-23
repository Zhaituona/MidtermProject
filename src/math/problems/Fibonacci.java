package math.problems;

import java.util.Arrays;

public class Fibonacci {

    public static void  Fibonacci(int[] array) {


        int[] fibo = new int[40];

        for (int i = 0; i < 40; i++) {
            if (i < 2) {
                fibo[i] = i;
            } else {
                fibo[i] = fibo[i - 2] + fibo[i - 1]; // 1,2,3,5,8
                // 1+1=2, 1+2 =3, 2+3 =5, 5+3 =8
            }// end of if else

        }
        // end of for loop

        System.out.println(Arrays.toString(fibo));


    }

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

        //

        int [] fibo = new int [40];

        for(int i =0; i< 40; i++){
            if(i < 2) {
                fibo[i] = i;
            }
            else{
                fibo[i]=fibo[i-2] + fibo[i-1]; // 1,2,3,5,8
                // 1+1=2, 1+2 =3, 2+3 =5, 5+3 =8
            }// end of if else

        }// end of for loop
        System.out.println(Arrays.toString(fibo));

    }// end of main method
}// end of class




