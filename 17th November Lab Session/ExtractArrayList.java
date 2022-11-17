//Problem Statement 3:
//Write a Java program to extract a portion of an array list.

import java.util.ArrayList;
import java.util.List;

public class ExtractArrayList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();           //List initialize
        l.add("Red");                                           //input elements using add method
        l.add("Green");
        l.add("Orange");
        l.add("White");
        l.add("Black");
        System.out.println("Main List"+l);                         //printing main list
        List<String> sl = l.subList(0, 3);      //extract a portion
        System.out.println("First three elements :"+sl);             //printing portion
    }
}
