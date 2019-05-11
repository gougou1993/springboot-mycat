package cn.wolfcode.mycat.controller;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import cn.wolfcode.mycat.domain.Author;
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

    /**
     * 
     */
    @GetMapping("/hello")
    public void name(Model model) {
        Map<String, Object> map = model.asMap();
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();

            Object value = map.get(key);

            System.out.println(key + ">>>>" + value);
        }

    }

    /**
     * 
     * @param book
     * @param author
     * @return
     */
    @GetMapping("/b")
    public String book(Book book, Author author) {
        return book.toString() + ">>>" + author.toString();
    }

    /**
     * 
     * @param book
     * @param author
     * @return
     */
    @GetMapping("/global")
    public String bookGlobal(@ModelAttribute("b") Book book, @ModelAttribute("a") Author author) {
        return book.toString() + ">>>" + author.toString();
    }
}