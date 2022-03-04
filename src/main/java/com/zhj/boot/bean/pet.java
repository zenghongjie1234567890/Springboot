package com.zhj.boot.bean;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-01 22:21
 **/
public class pet {
    private String name;
    private int age;

    public pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
