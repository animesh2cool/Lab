//Problem: 3 Write a program to create custom exception in java.

import java.lang.Exception;

class CustomException extends Exception {
    String message;
    public CustomException(String str) {                //creating custom exception method
       message = str;
    }
    public String toString() {                          //calling toString method
       return ("Custom Exception Occurred : " + message);
    }
 }
 public class NewException {
    public static void main(String args[]) {
       try {
          throw new CustomException("This is a custom message");    //calling custom exception method
       } catch(CustomException e) {
          System.out.println(e);
       }
    }
 }