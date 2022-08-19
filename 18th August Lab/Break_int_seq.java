// Write a Java program to break an integer into a sequence of individual digits.

package lab;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);  //object of the Scanner class 
		System.out.print("Enter a six-digit number: ");  
		//reading a number from the user  
		int num=obj.nextInt();  
		int digit1=num/100000%10;   
		int digit2=num/10000%10;  
		int digit3=num/1000%10;  
		int digit4=num/100%10;  
		int digit5=num/10%10;  
		int digit6=num%10;  
		
		System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5 + " " + digit6);  
		

	}

}