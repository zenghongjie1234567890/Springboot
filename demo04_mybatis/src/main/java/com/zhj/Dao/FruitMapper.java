package com.zhj.Dao;

import com.zhj.bean.Fruit;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface FruitMapper {
    // 根据fid获取指定的水果库存信息
    Fruit getFruitByFid(Integer fid);
}
