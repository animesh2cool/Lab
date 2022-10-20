// Problem: 1
import java.lang.Exception;
class MyException extends Exception { // Creating MyException class
    public MyException (String param) {
        super(param);
    }
public static class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 10/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("Invalid division");
        }
        try {
            String str = "i am animesh";
            int x = Integer.parseInt(str);
            System.out.println(x);
        }
        catch (NumberFormatException e) {
            System.out.println("Format mismatch");
        }
        try {
            int array[] = new int[10];
            array[11]=100;
            System.out.println(array[11]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }
        catch (Exception e ) {
            System.out.println("Exception encountered");
        }
        finally {
            System.out.println("Exception Handling Completed");
        }
    }
}
}