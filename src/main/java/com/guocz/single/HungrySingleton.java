package com.guocz.single;

import java.io.Serializable;

/**
 * @author guocz
 * @date 2022/9/1 11:30
 * 饿汉式
 */
public class HungrySingleton implements Serializable {

    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
