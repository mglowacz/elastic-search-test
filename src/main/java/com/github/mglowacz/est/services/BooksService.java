package com.github.mglowacz.est.services;

import com.github.mglowacz.est.model.Book;

import java.util.Collection;

public interface BooksService {
    Collection<Book> findBooks();
}
