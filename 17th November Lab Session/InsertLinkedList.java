//Problem Statement 5:
//Write a Java program to insert the specified element at the front of a linked list.

import java.util.LinkedList;

public class InsertLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();      //initiate linked list
        l.addFirst(2);                                       //input elements using addFirst method
        l.addFirst(3);
        l.addFirst(4);
        l.offerFirst(0);                                     //input specified element at the front
        System.out.println(l);
    }
}
