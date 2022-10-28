/*3. Write a method called addTwoPositive that takes two int parameters,
 and if either value is not positive, throw an ArithmeticException, 
passing the String "Non-positive integers sent!" to the constructor of the exception.
 If the values are both positive,  then return the sum of them.*/

 public class CheckPositive { 
     public void addTwoPositive(int n1, int n2) throws ArithmeticException {
         
         try {
             if(n1 < 0 || n2 < 0){                                                     // Checking condition.
                 throw new ArithmeticException("Non-positive integers sent!");      // Throwing new Arithmetic Exception
             }
             else{
                 System.out.println("Sum = "+(n1+n2));
                }
             }
         catch(ArithmeticException e) {
             System.out.println(e);
         }   
     }
     public static void main(String[] args) throws ArithmeticException{      // Main method
 
         CheckPositive c = new CheckPositive();
         c.addTwoPositive(6,-5);
         c.addTwoPositive(6,5);
     }
     
 }