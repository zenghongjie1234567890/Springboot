package com.zhj.boot.config;

import com.zhj.boot.bean.game;
import com.zhj.boot.bean.pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Springboot
 * <p>
 * <p>
 * MyConfig
 *
 * @author : 曾小杰
 * @date : 2022-03-01 22:24
 **/

@Configuration    // 告诉springboot这是一个配置类 == beans.xml配置文件
/*
 *   1.配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 *   2.配置类本身也是组件
 *   3.proxyBeanMethods: 代理bean的方法
 *        Full(proxyBeanMethods=true)
 *        Lite(proxyBeanMethods=false)
 *        组件依赖
 */

public class MyConfig {

    @Bean   // 给容器中添加组件，以方法名作为组件的id，返回类型就行组件类型。返回的值，就是组件在容器中的实例
    public game lol(){
        return new game("英雄联盟",10);
    }

    @Bean("zyp")   // 默认组件名是方法名，可以自定义
    public pet cat(){
        return new pet("狗狗",20);
    }
}
