// Swapping two variables
//Swapping two variables refers to mutually exchanging the values of the variables.
//Generally, this is done with the data in memory.
//The simplest method to swap two variables is to use a third temporary variable :
public class Swap {
 
    public static void main(String[] args)
    {
        int x = 100, y = 200; //initialize two local variable
 
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 
        int temp = x;   //initialize temporary local variable and insert x into temp variable
        x = y;          // put y value into x
        y = temp;       //put temp value into y
 
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}