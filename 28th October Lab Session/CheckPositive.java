/*Problem 2 :
Take two numbers x and y. Throw the exception if the two numbers are negative else print the 
Product of x and y.
Input Format
The only line of input consist of two integers, x and y.
Constraints
-20<= x, y <=20
Output Format
Print the product if both are positive else print the output as below:
java.lang.Exception: x and y should not be zero.*/

import java.lang.Exception;
import java.util.Scanner;

public class CheckPositive {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);                    // Creating scanner object 
        System.out.println("Enter 1st Number x: ");
        int x = sc.nextInt(); 
        System.out.println("Enter 2nd Number y: ");
        int y = sc.nextInt();
        if (x < 0 && y < 0) {                                                // checking condition
            try { 
                throw new Exception("Both numbers are negative Number");   // Throwing new exception
            } catch (Exception e) {
                System.out.println(e.getMessage());                         // Printing the exception message
            }
        } else if (x > 1 && y > 1) {                                            // checking condition
            System.out.println("Product of two Numbers is: " + x * y);         // printing output 
        } else {
            try {
                throw new Exception("x and y should not be zero or less than.");     // Throwing another exception
            } catch (Exception e) { 
                System.out.println(e);
            }
        }

    }
}