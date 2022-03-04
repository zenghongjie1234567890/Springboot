package com.zhj.boot;

import com.sun.corba.se.spi.ior.MakeImmutable;
import com.zhj.boot.bean.pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Springboot: 这是一个主程序类，相当于运行tomcat一样
 *
 * @author : 曾小杰
 * @date : 2022-03-01 13:38
 **/
// 该注解标明这是一个springboot项目

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        // 1.返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        // 2.查看容器里面的组件
        String[] names=run.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
        // 3.从容器中获取组件
        run.getBean("zyp", pet.class);
    }
}
