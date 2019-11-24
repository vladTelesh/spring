package com.project.tms;

import com.project.tms.di.Element;
import com.project.tms.di.ElementImp;
import com.project.tms.di.Paint;
import com.project.tms.di.PaintImpl;
import com.project.tms.entity.Author;
import com.project.tms.entity.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;



@Configuration
@ComponentScan(basePackages = "com.project.tms.entity")
public class AppConfig {

    @DependsOn(value = "author")
    @Bean(name = "book1")
    public Book getBook1() {
        Book book = new Book();
        book.setName("book1");
        return book;
    }
    @DependsOn(value = "author")
    @Bean(name = "book2")
    public Book getBook2() {
        Book book = new Book();
        book.setName("book2");
        return book;
    }
    @DependsOn(value = "author")
    @Bean(name = "book3")
    public Book getBook3() {
        Book book = new Book();
        book.setName("book3");
        return book;
    }

    @Bean(name = "author")
    public Author getAuthor() {
        Author author = new Author();
        author.setName("Vlad");
        return author;
    }
}
