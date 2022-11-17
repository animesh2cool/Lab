//Problem Statement 6:
//Write a Java program to replace an element in a linked list.

import java.util.LinkedList;

public class ReplaceLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();      //initiate linked list
        l.addFirst(0);                                       //input elements using addFirst method
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);                                    
        System.out.println("Main List"+l);
        l.set(3, 9);                            // replacing 9 in index 3
        System.out.println("After replace :"+l);
    }
}