package com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity -  this annotation specifies that the class is an entity
@Entity
//@Table - this annotation specifies the table in the database where entity is mapped
@Table(name = "books")
public class BookEntity {
    //@Id - this annotation specifies the primary key of the entity
    @Id
    private int bookId;
    private String bookTitle;
    private String authorName;
    private double bookPrice;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}
