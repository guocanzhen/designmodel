package com.guocz.single;

/**
 * @author guocz
 * @date 2022/9/1 10:24
 * 懒汉式）
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        // 这种实现方式在多线程场景下会有线程安全问题
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
