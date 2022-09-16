package com.guocz.proxy.cglib;

/**
 * @author guocz
 * @date 2022/9/13 10:57
 *
 * 被代理类
 */
public class Me {

    private String word = "default";

    public Me() {

    }

    public Me(String word) {
        this.word = word;
    }

    public void move() {
        System.out.println("我执行了");
    }
}
