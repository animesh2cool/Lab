//Write a Java program to find the value of specified expression.
package Default;
public class Find_specific_value {
    public static void main(String[] args) {
        System.out.println("The 1st Expression is: "+"(101+0)/3");
        System.out.println("The 1st Value is: "+((101+0)/3));
        System.out.println("The 2nd Expression is: "+"3.0-6 * 10000000.1");
        System.out.println("The 2nd Value is: "+(3.0-6 * 10000000.1));
        System.out.println("Output of true && true will be : "+(true && true));
        System.out.println("Output of false && true will be: "+(false && true));
        System.out.println("Output of (false && false) || (true && true) will be: "+((false && false) || (true && true)));
        System.out.println("Output of (false || false) && (true && true) will be: "+(((false || false) && (true && true))));

    }
    
}
