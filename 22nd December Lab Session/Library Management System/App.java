package com;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    BookOperation bo = new BookOperation();
	while (true) {
        System.out.println("************************************");
        System.out.println("Welcome To Library Management System");
        System.out.println("************************************");
        System.out.println("press 1 for Add Book");
        System.out.println("press 2 for Fetch Book");
        System.out.println("press 3 for Exit");
        int c = s.nextInt();

        if (c == 1) {
            bo.addBook();
        }
        else if (c == 2) {
            bo.fetchBook();
        }
        else if (c == 3) {
            break;
        }
        else {
                System.out.println("Invalid Input please try again");
        }
    }
}
}
