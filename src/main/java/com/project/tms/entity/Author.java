package com.project.tms.entity;


import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Objects;


public class Author {
    //@Value("Vadim")
    private String name;
    private List<Book> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Autowired
    public void setBook(List<Book> book) {
        this.books = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) &&
                Objects.equals(books, author.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books);
    }
}
