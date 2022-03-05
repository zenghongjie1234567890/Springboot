package com.zhj.controller.JsonController;

import com.zhj.bean.Books;
import com.zhj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-05 18:13
 **/
@RestController
public class BookJsonController {
    @Autowired
    BookService bookService;

    @GetMapping
    @RequestMapping("/zyp/{id}")
    public Books index01(@PathVariable("id") Integer id) {
        Books books = bookService.getById(id);
        System.out.println(books);
        return books;
    }

    @GetMapping
    @RequestMapping("/zyp")
    public List<Books> index02() {
        List<Books> all = bookService.selectAll();
        System.out.println(all);
        return all;
    }
}
