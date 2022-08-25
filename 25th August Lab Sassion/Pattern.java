//Q3. WAP to draw the pattern (user input)

import java.util.Scanner;
public class Pattern {
public static void main(String arg[]) {
    Scanner sc=new Scanner(System.in); // initialize scanner class
	    System.out.println("please enter a number");
            int n =sc.nextInt(); //store the user input in a variable
    for (int i = 0; i < n; i++) {
        for (int j = n - i; j > 1; j--) { //Loop for blank space
            System.out.print(" "); //Print Space
        }for (int j = 0; j <= i; j++) { //loop for star
            System.out.print("* "); //Print Star
            }
        System.out.println(); //Newline
        }
    }
}