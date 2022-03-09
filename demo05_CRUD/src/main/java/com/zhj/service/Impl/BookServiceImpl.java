package com.zhj.service.Impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhj.Dao.BooksMapper;
import com.zhj.bean.Books;
import com.zhj.bean.BooksExample;
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
    private BooksMapper booksMapper;

    @Override
    public Books getById(Integer id) {
        Books books = booksMapper.selectByPrimaryKey(id);
        return books;
    }

    @Override
    public PageInfo<Books> selectAll(Integer CurrentPage, Integer size) {
        PageHelper.startPage(CurrentPage,size);
        List<Books> books = booksMapper.selectByExample(null);
        PageInfo<Books> info = new PageInfo<>(books);
        return info;
    }

    @Override
    public void delById(Integer id) {
        booksMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updById(Books books) {
        booksMapper.updateByPrimaryKey(books);
    }

    @Override
    public void insertDa(Books books) {
        booksMapper.insert(books);
    }

    @Override
    public List<Books> selectByTitle(String title) {
        BooksExample example = new BooksExample();
        example.createCriteria().andTitleLike("%"+title+"%");
        List<Books> books = booksMapper.selectByExample(example);
        return books;
    }
}
