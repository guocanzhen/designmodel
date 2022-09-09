package com.guocz.single;

/**
 * @author guocz
 * @date 2022/9/1 11:54
 * 双重检查加锁 - 懒汉式
 */
public class DoubleCheckSingleton {

    /**
     * 不加volatile修饰会存在指令重排序问题
     */
    private static volatile DoubleCheckSingleton singleton;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
