package com.zhj.controller.ViewController;

import com.zhj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-04 21:15
 **/
@Controller
public class BookViewController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/list")
    public String test01(){
        System.out.println("list");
        return "list";
    }

    @RequestMapping("/404")
    public String test02(){
        System.out.println("404");
        return "404";
    }



}
