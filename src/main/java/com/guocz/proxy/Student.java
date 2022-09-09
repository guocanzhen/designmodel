package com.guocz.proxy;

/**
 * @author guocz
 * @date 2022/9/1 14:58
 * 被代理对象实现接口，完成具体的业务逻辑
 */
public class Student implements Person{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name + "上交班费50元");
    }
}
