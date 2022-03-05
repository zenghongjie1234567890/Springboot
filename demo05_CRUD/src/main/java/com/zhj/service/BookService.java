package com.zhj.service;

import com.zhj.bean.Books;
import com.zhj.bean.BooksExample;

import java.util.List;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-04 21:13
 **/
public interface BookService {
    Books getById(Integer id);
    List<Books> selectAll();
    void delById(Integer id);
    void updById(Books books);
}
