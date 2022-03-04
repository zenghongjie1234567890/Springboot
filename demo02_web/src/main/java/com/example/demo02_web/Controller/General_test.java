package com.example.demo02_web.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-02 22:32
 **/
@RestController
public class General_test {
    @RequestMapping("/2.png")
    public String text01(){
        return "aaa";
    }
}
