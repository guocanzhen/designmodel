package com.guocz.observe;

import lombok.Data;

/**
 * @author guocz
 * @date 2022/9/2 9:08
 * 支付宝观察者
 */
@Data
public class AliUser implements Observer{

    private String name;

    public AliUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
