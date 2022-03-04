package com.example.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo01Application {
    // springboot项目代码必须放在该Application类所在的同级目录或下级目录

    public static void main(String[] args) {
        SpringApplication.run(Demo01Application.class, args);
    }

}
