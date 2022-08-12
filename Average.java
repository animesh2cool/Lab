// Write a Java program that takes five numbers as input to calculate and print the average of the numbers.
class Average{
    public static void main(String ...args)
    {
        System.out.println("Enter five numbers :");
        int a = 10; //initialize 1st local variable
        int b = 20; //initialize 2nd local variable
        int c = 30; //initialize 3rd local variable
        int d = 40; //initialize 4th local variable
        int e = 50; //initialize 5th local variable
        System.out.println("Input first number:"+a); // 10
        System.out.println("Input second number:"+b); // 20
        System.out.println("Input third number:"+c); // 30
        System.out.println("Input fourth number:"+d); // 40
        System.out.println("Enter fifth number:"+e); // 50
        int avg = (a+b+c+d+e)/5; //logic
        System.out.println("The Average is :"+avg);
    }
}