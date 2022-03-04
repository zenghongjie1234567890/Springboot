package com.example.demo02_web.bean;

import lombok.Data;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-03 10:37
 **/

//   @Data : 注解在类上, 为类提供读写属性, 此外还提供了 equals()、hashCode()、toString() 方法
@Data
public class Person {
    private String username;
    private Integer age;
    private String birth;
    private Pet pet;
}
