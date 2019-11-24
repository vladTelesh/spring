package com.project.tms.service;

import com.project.tms.AppConfig;
import com.project.tms.entity.Author;
import com.project.tms.entity.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;


public class ServiceApp implements Service {
    private ApplicationContext context;

    public ServiceApp() {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
       // context = new ClassPathXmlApplicationContext("beans_from_app_Main");
    }

    @Override
    public void getBooksByNameAuthor(String name) {
        Map<String, Author> map = context.getBeansOfType(Author.class);
        Collection<Author> map2 = map.values();
        Stream<Author> stream = map2.stream();
        stream.forEach(x -> System.out.println(x.getName()));

        Author author = context.getBean(name, Author.class);
        System.out.println(author.getName());
        for (Book book : author.getBooks()) {
            System.out.println(book.getName());
        }
    }

    @Override
    public void getAuthorByNameBook(String name) {

    }
}
