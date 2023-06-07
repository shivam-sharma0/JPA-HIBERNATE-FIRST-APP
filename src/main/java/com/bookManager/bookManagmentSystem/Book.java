package com.bookManager.bookManagmentSystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Book {
    @Id
    private Integer bookId;

    private String bookName;

    private  Integer totalPages;

    public Book(int bookId, String bookName, int totalPages) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.totalPages = totalPages;
    }

    public Book() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
