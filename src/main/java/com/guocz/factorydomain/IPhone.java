package com.guocz.factorydomain;

/**
 * @author guocz
 * @date 2022/9/1 9:26
 * IPhone类：制造苹果手机（Product2）
 */
public class IPhone implements Phone {
    public IPhone() {
        this.make();
    }
    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make iphone!");
    }
}