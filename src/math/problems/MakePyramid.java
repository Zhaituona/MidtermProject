package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        // create a loop for run

        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50 - i; j++) {// every time is less order.
                System.out.print(" ");// we just need to show need
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");// put space
            }
            System.out.println();


        }

        }
  }
