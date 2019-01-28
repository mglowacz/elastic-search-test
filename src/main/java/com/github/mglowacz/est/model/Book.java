package com.github.mglowacz.est.model;

//@Documented(indexName = "blog", type = "article")
public class Book {
    private String title;
    private String author;

    public static Book createBook(String title, String author) {
        Book book = new Book();
        book.title = title;
        book.author = author;
        return book;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
