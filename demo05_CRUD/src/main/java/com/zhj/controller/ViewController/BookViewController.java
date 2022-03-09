package com.zhj.controller.ViewController;

import com.zhj.bean.Books;
import com.zhj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
        return "list";
    }



}
