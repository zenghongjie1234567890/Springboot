package com.zhj.controller;

import com.zhj.bean.Books;
import com.zhj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-04 21:15
 **/
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/zyp/{id}")
    public Books index(@PathVariable("id") Integer id){
        Books books = bookService.getById(id);
        System.out.println(books);
        return books;
    }
}
