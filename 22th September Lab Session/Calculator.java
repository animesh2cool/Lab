/* 2. Write a java program to illustrate Calculator class with addition, 
subtraction, multiplication methods that can take any number of parameters 
to perform the operation, without using method/constructor overloading. */

import java.util.Scanner;

 public class Calculator {
    public static int addition (int num1, int num2) {
        return num1 + num2;
    }
        public static int subtraction (int num1, int num2) {
            return num1 - num2;
        }
        public static int multiplication (int num1, int num2) {
            return num1 * num2;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(" Please Enter one Number : ");
    int num1 = sc.nextInt();
    System.out.print(" Please Enter another Number : ");
    int num2 = sc.nextInt();
    sc.close();
    
    System.out.print("\n Adition of two number : " +  addition(num1, num2));
    System.out.print("\n subtraction of two number : " +  subtraction(num1, num2));
    System.out.print("\n multiplication of two number : " +  multiplication(num1, num2));

     }
    }