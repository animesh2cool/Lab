//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
class Math{
    public static void main(String ...args)
    {
        System.out.println("Enter two numbers :");
        int a = 125; //initialize 1st local variable
        int b = 24; //initialize 2nd local variable
        System.out.println(a+" "+b); // 125 24
        int sum = a+b; //addition
        int mult = a*b; //multiply
        int sub = a-b; //subtract
        int div = a/b; //divide
        int rem = a%b; //remainder
        System.out.println("The Addition is :"+sum);
        System.out.println("The Multiplication is :"+mult);
        System.out.println("The Subtraction is :"+sub);
        System.out.println("The Division is :"+div);
        System.out.println("The Remainder is :"+rem);
    }
}