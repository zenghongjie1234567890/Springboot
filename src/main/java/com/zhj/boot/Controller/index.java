package com.zhj.boot.Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-01 13:40
 **/

// 该注解集合了@Respones 和 @RequestMapping

@RestController
public class index {

    @RequestMapping("/zhj")
    public String  text(){
        return "hello world，zyp ";
    }

}
