/* Problem 1. Write a Java method to check whether every digit of a given integer 
is even. Return true if every digit is odd otherwise false? */

import java.util.*;

public class IsOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // initialize scanner class
        System.out.println("Please Enter any number : ");
        String str= sc.nextLine();
        int[] intArray = new int[str.length()];

    for (int i = 0; i < str.length(); i++)
    {
        intArray[i] = Integer.parseInt(Character.toString(str.charAt(i)));
    }
    for(int i=0;i<intArray.length;i++){  
        if (intArray[i]%2!=0){  
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        }
    }
}