package com.bookManager.bookManagmentSystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    BookServices bookServices;
    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){
        bookServices.addBook(book);
        return "Book "+book.getBookName()+" is Succesfully addded ";
    }
    @GetMapping ("/getBook")
    public Book getBook(@RequestParam Integer id){
        return bookServices.getBook(id);
    }

}
