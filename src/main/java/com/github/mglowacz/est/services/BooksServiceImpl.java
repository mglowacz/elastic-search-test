package com.github.mglowacz.est.services;

import com.github.mglowacz.est.model.Book;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;

@Service
public class BooksServiceImpl implements BooksService {

    @Override
    public Collection<Book> findBooks() {
        Collection<Book> books = Arrays.asList(Book.createBook("Hobbit", "JRR Tolkien"));
        return books;
    }
}
