package com.zhj.comtroller;

import com.zhj.bean.Fruit;
import com.zhj.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-04 16:43
 **/
@RestController
public class fruitController {
    @Autowired
    FruitService service;

    @RequestMapping("/zhj/{fid}")
    public Fruit text(@PathVariable("fid") Integer fid){
        System.out.println("这是第二个");
        Fruit fid1 = service.getFruitByFid(fid);
        return fid1;
    }


}
