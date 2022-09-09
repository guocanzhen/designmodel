package com.guocz.factorydomain;

/**
 * @author guocz
 * @date 2022/9/1 10:06
 * MAC类：定义苹果电脑产品(MAC)
 */
public class MAC implements PC {
    public MAC() {
        this.make();
    }
    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make MAC!");
    }
}