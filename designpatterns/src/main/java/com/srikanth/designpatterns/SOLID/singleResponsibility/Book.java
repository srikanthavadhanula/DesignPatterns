package com.srikanth.designpatterns.SOLID.singleResponsibility;

public class Book {
    private String name;
    private String author;
    private String content;

    public void updateDetails(Book book) {
        this.author = book.author;
    }

    public void replaceWordsInContent(String original, String modified) {
        this.content.replace(original,modified);
    }

    public Book printBook(Book book) {
        return book;
    }
}
