package com.example.demo01.root.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-02 17:08
 **/

@Component // 将此类交给spring容器进行管理
@ConfigurationProperties(prefix = "girl")  // 映射application.yml里面的girl类

public class girlFriend {

    private String name;
    private String age;

    public girlFriend(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public girlFriend() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
