package com.guocz.factorydomain;

/**
 * @author guocz
 * @date 2022/9/1 10:04
 * MiPC类：定义小米电脑产品(MIPC)
 */
public class MiPC implements PC {
    public MiPC() {
        this.make();
    }
    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make xiaomi PC!");
    }
}
