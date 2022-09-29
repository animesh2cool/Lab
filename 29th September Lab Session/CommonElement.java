/* Problem 5. 
Write a Java program to find common elements from three sorted 
(in non-decreasing order) arrays */

import java.util.*;

public class CommonElement {
    public static void method(int a[], int b[]) {
        for (int i=0; i< a.length; i++) {
            for (int j = 0; j< b.length; j++)  {
                if (a[i] == b[j]) {
                    System.out.println("Common Elements are : " +a[i]);
                }
            }
        }
    }
    public static void main(String args[]) {
        int a[] = {7,2,5,8,9,1};
        int b[] = {6,2,1,10,66,81};
        Arrays.sort(a);
        Arrays.sort(b);
        CommonElement ce = new CommonElement();
        CommonElement.method(a, b);
    }
}