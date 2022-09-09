package com.guocz.single;

/**
 * @author guocz
 * @date 2022/9/1 14:00
 * 枚举实现单例模式
 */
public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
        System.out.println("枚举创建对象了");
    }

    public static void doSomething() {
        System.out.println("这是枚举类型的单例模式！");
    }
}
