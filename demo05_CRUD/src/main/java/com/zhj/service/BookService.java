package com.zhj.service;

import com.github.pagehelper.PageInfo;
import com.zhj.bean.Books;

import java.util.List;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-04 21:13
 **/
public interface BookService {
    Books getById(Integer id);
    PageInfo<Books> selectAll(Integer CurrentPage, Integer size);
    void delById(Integer id);
    void updById(Books books);
    void insertDa(Books books);
    List<Books> selectByTitle(String title);
}
