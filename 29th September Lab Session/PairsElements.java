/*Problem 4. 
a Java program to find all pairs of elements in an array whose sum is 
equal to a specified number */

import java.util.*;

public class PairsElements {
    static void findThePairs(int[] inputArray, int inputNumber) {
    System.out.println("Pairs of elements are : ");
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i+1; j < inputArray.length; j++) {
                if(inputArray[i]+inputArray[j] == inputNumber) {
                    System.out.println(inputArray[i]+" and "+inputArray[j]+"\nSum of them is "+inputNumber);
                }
            }
         }
     }
    public static void main(String args[]) {
        findThePairs(new int[] {10, 32, 12, 3, 1, 4, 2, 45, 5, 10},42);     // calling findThePairs Method
    }
            }
    