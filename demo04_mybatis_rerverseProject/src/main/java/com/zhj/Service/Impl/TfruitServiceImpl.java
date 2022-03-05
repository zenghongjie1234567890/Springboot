package com.zhj.Service.Impl;

import com.zhj.Dao.TFruitMapper;
import com.zhj.Service.TfruitService;
import com.zhj.bean.TFruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-05 14:16
 **/
@Service
public class TfruitServiceImpl implements TfruitService {

    @Autowired
    TFruitMapper tFruitMapper;

    @Override
    public TFruit getById(Integer fid) {
        TFruit key = tFruitMapper.selectByPrimaryKey(fid);
        System.out.println(key);
        return key;
    }
}
