//  1.write a java program to print sum of odd numbers up to N

import java.util.Scanner;

public class SumOfOddNumbers {
	private static Scanner sc;  

    public static int sumOfOdd(int num) {    //method to determine the sum of odd numbers
			int i, sum = 0;
			for(i = 1; i <= num; i++)
			{
				if(i % 2 != 0)
				{
					sum = sum + i; 
				}
			}
			return sum;
		}
	public static void main(String[] args) 
	{
		int number, oddSum = 0;
		sc = new Scanner(System.in); // intialize the scanner class
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	//taking the user input
		
		oddSum = sumOfOdd(number);  // passing the number through the sumofodd method
		
		System.out.println("The Sum of Odd Numbers upto " + number + "  is  " + oddSum);
	}
}