/* Q.2 you will make a class ‘Rectangle’ and declare the variable length and breadth as private. 
One Constructor will be used for initializing the value of variables. When an object is created, 
the constructor will be called and the default value of the instance variables will be assigned. 
Now create another new class ‘RectangleTest’ & create an object of class Rectangle and 
assign values of the parameter used in constructor. Calculate area of the rectangle and print 
it on the console. Let’s update the new value of variable. And then read the updated value. */

import java.util.Scanner;
class Rectangle {   // creating Rectangle class
	int lenght,breath;
Rectangle(int l,int b) {  // parameterized constructor
	lenght=l;
	breath=b;
	}
	
void calculation() {  // creating method to calculate area of rectangle
	int area=lenght*breath;
	System.out.println(area);
	}}
class RectangleTest{
	public static void main(String []args){
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st length of rectangle : ");
		int l1 = sc.nextInt(); 
		System.out.print("Enter 1st breadth of rectangle : "); 
		int b1 = sc.nextInt(); 
		System.out.print("Enter 2nd length of rectangle : "); 
		int l2 = sc.nextInt(); 
		System.out.print("Enter 2nd breadth of rectangle : "); 
		int b2 = sc.nextInt();
	Rectangle result1 = new Rectangle( l1,b1);  // passing lenght and breath of the first rectangle
	Rectangle result2 = new Rectangle(l2,b2);  // // passing lenght and breath of the second rectangle
	result1.calculation();  // calling the calculation method for result1
	result2.calculation();  // calling the calculation method for result2
	}
}