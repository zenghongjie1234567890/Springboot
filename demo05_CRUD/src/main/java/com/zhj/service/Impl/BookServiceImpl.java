package com.zhj.service.Impl;
import com.zhj.Dao.BooksMapper;
import com.zhj.bean.Books;
import com.zhj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-04 21:13
 **/
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BooksMapper booksMapper;

    @Override
    public Books getById(Integer id) {
        Books books = booksMapper.selectByPrimaryKey(id);
        return books;
    }

    @Override
    public List<Books> selectAll() {
        return booksMapper.selectAll();
    }

    @Override
    public void delById(Integer id) {
        booksMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updById(Books books) {
        booksMapper.updateByPrimaryKey(books);
    }
}
