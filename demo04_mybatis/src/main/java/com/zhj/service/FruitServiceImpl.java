package com.zhj.service;
import com.zhj.Dao.FruitMapper;
import com.zhj.bean.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FruitServiceImpl implements FruitService {

    @Autowired
    FruitMapper fruitMapper;

    @Override
    // 开启事务的扫描,该注解用在方法上
    @Transactional
    public Fruit getFruitByFid(Integer fid) {
        Fruit byFid = fruitMapper.getFruitByFid(fid);
        System.out.println(byFid);
        System.out.println("这是第一个");
        return byFid;
    }

}
