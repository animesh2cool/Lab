package com;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookOperation implements Dao {
    public void addBook() {
        //opens and connection with db and session object perform CURD
        Session ses = HibernateUtil.getSessionFactory().openSession();
        //operation performed in db, save permenent
        Transaction t = ses.beginTransaction();
        int bid;
        String title, author;
        double price;
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter a Book ID : ");
        bid = s.nextInt();
        System.out.println("Please Enter Title of the Book : ");
        title = s.next();
        System.out.println("Please Enter Author of the Book : ");
        author = s.next();
        System.out.println("Please Enter price of the Book: ");
        price = s.nextDouble();
        //create object of persistent class
        BookEntity be = new BookEntity();
        be.setBookId(bid);
        be.setBookTitle(title);
        be.setAuthorName(author);
        be.setBookPrice(price);
        ses.save(be);
        t.commit();
        System.out.println("Your Book has been Successfully Added");
        ses.close();
    }

    public void fetchBook() {
        //opens and connection with db and session object perform CURD
        Session session = HibernateUtil.getSessionFactory().openSession();
        int id;
        Scanner s = new Scanner(System.in);     //calling scanner class
        System.out.println("Please Enter the Book ID to Fetch Book Details : ");
        id = s.nextInt();                       //stor user input
        //create object of persistent class and using load method to fetch data from database
        BookEntity be = session.load(BookEntity.class, id);
        //print information using get method
        System.out.println(" Book ID : " + be.getBookId() + " Title :" + be.getBookTitle() + " Author : "
                + be.getAuthorName() + " Book Price : " + be.getBookPrice());
        session.close();
    }
}