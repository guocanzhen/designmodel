package com.guocz.proxy;

/**
 * @author guocz
 * @date 2022/9/1 15:30
 * 被代理对象实现接口，完成具体的业务逻辑
 */
public class StudentDynamic implements Person{

    private String name;

    public StudentDynamic(String name) {
        this.name = name;
    }
    @Override
    public void giveMoney() {
        try {
            //假设数钱花了一秒时间
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "上交班费50元");
    }
}
