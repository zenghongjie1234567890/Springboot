package com.zhj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@ComponentScan("com.zhj.Dao")
public class Demo05CrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo05CrudApplication.class, args);
    }

}
