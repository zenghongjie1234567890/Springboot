package com.zhj.service;

import com.zhj.bean.Fruit;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-04 16:47
 **/
public interface FruitService {
    Fruit getFruitByFid(Integer fid);
}
