package com.zhj.boot.bean;

/**
 * Springboot
 *
 * @author : 曾小杰
 * @date : 2022-03-01 22:22
 **/
public class game {
    private String gameName;
    private int money;

    public game(String gameName, int money) {
        this.gameName = gameName;
        this.money = money;
    }

    @Override
    public String toString() {
        return "game{" +
                "gameName='" + gameName + '\'' +
                ", money=" + money +
                '}';
    }
}
