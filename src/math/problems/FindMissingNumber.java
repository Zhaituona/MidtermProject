package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    // this is another way create method

    public static int findMissingNumber(int[] array, int n) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {// take the length ,
            sum = sum + array[i];
        }
        System.out.println(sum);

        int total = 0;// have to take all ,cause one is missing
        for (int j = 0; j <= 10; j++) {// it will take all of them
            //(int j =-1; j<=10; j++)// the smallest one start from -1 ,
            total = total + j;
        }
        return total-sum;
       // System.out.println("******************);
       // System.out.println(total);
       // System.out.println("Missing number is : " + (total - sum));
    }





    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        int sum = 0;
        for (int i =0;i<array.length; i++){// take the length ,
            sum= sum +array[i];
        }
        System.out.println(sum);

        int total = 0;// have to take all ,cause one is missing
        for(int j = 0; j<= 10;j++) {// it will take all of them
            //(int j =-1; j<=10; j++)// the smallest one start from -1 ,
            total = total + j;
        }
        System.out.println("*****************");
        System.out.println(total);
        System.out.println("Missing number is : "  + (total -sum));
    }
}




