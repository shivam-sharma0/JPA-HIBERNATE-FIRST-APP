package com.bookManager.bookManagmentSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServices {

    @Autowired
    private BookRepository bookRepository;
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public Book getBook(Integer id) {
        try {
            Book book = bookRepository.findById(id).get();
            return book;
        } catch (Exception ex){
            System.out.println("Book is not prersent with this id ");
        }
        return null;
    }
}
