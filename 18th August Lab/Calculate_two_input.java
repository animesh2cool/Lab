// Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance
//(the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers). */

package lab;
import java.util.Scanner;
public class Calculate {
	public static void main(String[] args) {
		
		int a,b;
	
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter first integer =");
		a=obj.nextInt();
		System.out.print("Enter Second integer =");
		b=obj.nextInt();
	   int sum=a+b;
	   int difference=a-b;
	   int product=a*b;
	   int max=Math.max(a, b);
	   int min=Math.min(a, b); 
	   
	   System.out.println("the sum is="+sum);
	   System.out.println("the difference is="+difference);
	   System.out.println("the product is="+product);
	   System.out.println("the max is="+max);
	   System.out.println("the min is="+min);	
		
	}

}