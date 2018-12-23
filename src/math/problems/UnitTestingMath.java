package math.problems;
import org.testng.Assert;


public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        // testing for factorial
        Assert.assertEquals(120,Factorial.factorial(5));// this for factorial

        // testing for find lowest difference
       int [] array1 = {12,36,3,5,7,8,90};
       int[] array2 = {11,98,6,45,2,1,3,76,1};
       Assert.assertEquals(1,FindLowestDifference.lowestDiff(array1,array2));

       // testing for find missing number
       int [] array3 = {1,2,3,4,5,6,8,9,10};
       Assert.assertEquals(7,FindMissingNumber.findMissingNumber(array3,10));

       // testing for find lowest number
       int [] array4 = {1,36,2,5,8,9,78};
       Assert.assertEquals(1,LowestNumber.findLowestNumber(array4));










    }
}
