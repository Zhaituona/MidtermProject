package string.problems;
import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {

        //Apply Unit Test into all the methods in this package.
        Assert.assertEquals(true,Anagram.isAnagram("MARY","ARMY"));

        // testing for DetermineLargestWord
        String testStr1 = "I am learning Java and Selenium";
       // String s="Human brain is a biological learning machine";
       // Assert.assertEquals("{1=I, 2=am, 3=and, 4=Java, 8=Selenium}",DetermineLargestWord.findTheLargestWord(testStr1));

        //Testing DuplicateWord
      //  String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
      //  Assert.assertEquals("Java: 3, a: 1, Language.: 1, widely: 1, is: 3, also: 1, language: 1, used: 1, an: 1, Island: 1, Indonesia.: 1, of: 1, programming: 1",DuplicateWord.DuplicateWords(st));




    }
}
