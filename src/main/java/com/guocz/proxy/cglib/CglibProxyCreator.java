package com.guocz.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * @author guocz
 * @date 2022/9/13 11:29
 */
public class CglibProxyCreator {

    public static <T> T create(Class<T> clazz, MethodInterceptor methodInterceptor) {
        // 通过Enhancer对象的create()方法可以生成一个类，用于生成代理对象
        Enhancer enhancer = new Enhancer();
        // 设置父类 (没有父类将目标类作为其父类)
        enhancer.setSuperclass(clazz);
        // 置拦截器 回调对象为本身对象
        enhancer.setCallback(methodInterceptor);
        // 生成一个代理类对象，并返回
        return  (T) enhancer.create();
    }
}
