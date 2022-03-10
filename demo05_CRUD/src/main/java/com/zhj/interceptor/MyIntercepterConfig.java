package com.zhj.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-10 18:49
 **/

@Configuration
public class MyIntercepterConfig implements WebMvcConfigurer {
    @Bean
    MyIntercepter intercepter(){
        return new MyIntercepter();
    }

    @Autowired
    MyIntercepter myIntercepter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.myIntercepter).addPathPatterns("/**");  // 所有的都拦截
    }
}
