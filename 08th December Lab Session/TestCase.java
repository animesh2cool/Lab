//Problem Statement: 3
//In Eclipse, run MyEvenOddTest class as JUnit Test.

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCase {
    @Test
    public void test1(){
        // passing a even number 66 and it is returning true so the test is pass
        assertEquals(true, JUtestEvenOdd.testEvenOdd(66)); // calling testEvenOdd method
    }

    @Test
    public void test2(){
        // passing a odd number 77 and it is returning false so the test is fail
        assertEquals(true, JUtestEvenOdd.testEvenOdd(77)); // calling testEvenOdd method
    }
}