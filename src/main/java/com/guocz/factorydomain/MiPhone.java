package com.guocz.factorydomain;

import com.guocz.factorydomain.Phone;

/**
 * @author guocz
 * @date 2022/9/1 9:25
 * MiPhone类：制造小米手机（Product1）
 */
public class MiPhone implements Phone {
    public MiPhone() {
        this.make();
    }
    @Override
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make xiaomi phone!");
    }
}