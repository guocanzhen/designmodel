package com.guocz.observe;

/**
 * @author guocz
 * @date 2022/9/1 15:58
 * 具体观察者（ConcrereObserver）
 */
public class WeixinUser implements Observer{

    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
