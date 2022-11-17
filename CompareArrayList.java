//Problem Statement 4:
//Write a Java program to compare two array lists.

import java.util.ArrayList;
import java.util.List;

public class CompareArrayList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();           //initialize fist list
        list1.add("Red");                                     //input elements using add method
        list1.add("Green");
        list1.add("Orange");
        list1.add("White");
        list1.add("Black");
        System.out.println("First List :"+list1);               //printing first list
        
        List<String> list2 = new ArrayList<String>();           //initialize second list
        list2.add("Red");                                     //input elements using add method
        list2.add("Green");
        list2.add("Orange");
        list2.add("Black");
        System.out.println("Second List :"+list2);              //printing secont list

        List<String> list3 = new ArrayList<String>();
        for(String e : list1)                               //traversing
        list3.add(list2.contains(e) ? "Yes" : "No");       //compare fisrt list with second list and add in the third list
        System.out.println("Compared :"+list3);            // printing third list
    }
}
