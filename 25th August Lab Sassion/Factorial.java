//Q1. WAP to find factorial of any number (user input)
import java.util.Scanner;
class Factorial
{
	public static void main(String arg[])
	
	{
	
            long n,fact=1;
	
	    Scanner sc=new Scanner(System.in); // initialize scanner class
 
	    System.out.println("please enter a number");
	   
            n=sc.nextLong(); //store the user input in a variable
 
	    for(int i=1;i<=n;i++) //use for loop to calculate factorial upto input number
	    {
	
	    fact=fact*i; 
 
 	    }
 
  	    System.out.println("factorial of your number is ="+fact); // print factrorial of user data
 
	}
 
}