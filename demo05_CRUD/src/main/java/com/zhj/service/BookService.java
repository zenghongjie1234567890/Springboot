package com.zhj.service;

import com.zhj.bean.Books;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-04 21:13
 **/
public interface BookService {
    Books getById(Integer id);
}
