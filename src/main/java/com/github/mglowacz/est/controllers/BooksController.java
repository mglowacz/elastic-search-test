package com.github.mglowacz.est.controllers;

import com.github.mglowacz.est.model.Book;
import com.github.mglowacz.est.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping("books")
    public Collection<Book> findBooks() {
        return booksService.findBooks();
    }
}
