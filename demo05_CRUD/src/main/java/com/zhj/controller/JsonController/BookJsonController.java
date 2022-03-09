package com.zhj.controller.JsonController;

import com.github.pagehelper.PageInfo;
import com.zhj.bean.Books;
import com.zhj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

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
    private BookService bookService;

    @GetMapping("/findById/{id}")
    public Books index01(@PathVariable("id") Integer id){
        Books byId = bookService.getById(id);
        System.out.println(byId);
        System.out.println("id为:"+id+"的数据回显成功");
        return byId;
    }

    @PostMapping("/getAll")
    public PageInfo<Books> index02(Integer CurrentPage,Integer size) {
        PageInfo<Books> all = bookService.selectAll(CurrentPage, size);
        return all;
    }

    @DeleteMapping("/del/{id}")
    public void index03(@PathVariable("id") Integer id){
        bookService.delById(id);
        System.out.println("删除成功");
    }

    // 从前端获取请求体数据要@RequestBody      从后端获取响应体数据要@ResponseBody
    @PostMapping("/insertDate")
    public void index04(@RequestBody Books books){
        bookService.insertDa(books);
        System.out.println(books);
        System.out.println("添加成功");
    }

    @PutMapping("/update")
    public void index05(@RequestBody Books books){
        bookService.updById(books);
        System.out.println("更新成功");
    }

    @PostMapping("/search")
    public List<Books> index06(@RequestBody Books books) {
        System.out.println(books);
        List<Books> books1 = bookService.selectByTitle(books.getTitle());
        return books1;
    }
}
