package com.zhj.Controller;

import com.zhj.Service.TfruitService;
import com.zhj.bean.TFruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-05 14:17
 **/
@RestController
public class TfrutController {
    @Autowired
    TfruitService tfruitService;

    @RequestMapping("/zhj/{fid}")
    public TFruit getId(@PathVariable("fid") Integer fid){
        TFruit byId = tfruitService.getById(fid);
        return byId;
    }
}
