package com.cms;

import java.util.Scanner;
//main class
public class App {
    //main method
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);         //scanner class
    CollegeOperation co = new CollegeOperation();       //calling CollegeOperation class
	while (true) {
        System.out.println("************************************");
        System.out.println("Welcome To Library Management System");
        System.out.println("************************************");
        System.out.println("press 1 for Add Student Details");
        System.out.println("press 2 for Fetch Student Details");
        System.out.println("press 3 for Update Student Details");
        System.out.println("press 4 for Delete Student Details");
        System.out.println("press 5 for Exit");
        int c = s.nextInt();

        if (c == 1) {
            co.addStudent();
        }
        else if (c == 2) {
            co.fetchStudent();
        }
        else if (c == 3) {
            co.updateStudent();
        }
        else if (c == 4) {
            co.deleteStudent();
        }
        else if (c == 5) {
            break;
        }
        else {
                System.out.println("Invalid Input please try again");
        }
    }
}
}