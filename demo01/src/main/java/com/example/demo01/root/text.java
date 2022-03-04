package com.example.demo01.root;

import com.example.demo01.root.bean.girlFriend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-02 16:20
 **/

@RestController  // 该注解包含了@responsebady 和 @Controller
public class text {

    @RequestMapping("/text01")
    public String test01() {
        return "hello world ,赵银屏";
    }

    @RequestMapping("/text02")  // 传入请求参数,浏览器访问网址要?message=某个值
    public String test02(String message) {
        return "hello world "+message;
    }

    // 使用@value注解
    @Value("${girl.name}")
    private String zz;

    @RequestMapping("/text03")
    public String test03() {
        return "hello world "+zz;
    }

    // 使用代理类对象来获取属性值
    @Autowired
    private girlFriend girlFriend;
    @RequestMapping("/text04")
    public String test04() {
        return "hello world "+girlFriend.getName()+girlFriend.getAge();
    }

}
