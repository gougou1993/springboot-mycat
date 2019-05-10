package cn.wolfcode.mycat.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wolfcode.mycat.domain.Book;

/**
 * BookController
 */
@RestController
public class BookController {

    @GetMapping("/book")
    public Book book() {
        Book book = new Book();
        book.setAuthor("zhong");
        book.setName("java");
        book.setPrice(100.85F);
        book.setPublicationDate(new Date());
        return book;
    }

}