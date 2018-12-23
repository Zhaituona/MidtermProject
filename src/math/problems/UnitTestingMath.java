package math.problems;
import org.testng.Assert;


public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        // testing for factorial
        Assert.assertEquals(120,Factorial.factorial(5));// this for factorial

        // testing for find lowest difference
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
       Assert.assertEquals(1,FindLowestDifference.lowestDiff(array1,array2));

       // testing for find missing number
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
       Assert.assertEquals(9,FindMissingNumber.findMissingNumber(array,10));

       // testing for find lowest number
       int [] array4 = {1,36,2,5,8,9,78};
       Assert.assertEquals(1,LowestNumber.findLowestNumber(array4));










    }
}
