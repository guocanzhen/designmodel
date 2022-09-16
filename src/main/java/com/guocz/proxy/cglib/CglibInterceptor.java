package com.guocz.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author guocz
 * @date 2022/9/13 11:01
 * 定义代理类，实现接口
 */
public class CglibInterceptor implements MethodInterceptor {

    /**
     * 目标对象
     */
    private Object target;

    /**
     * 通过构造器传入目标对象
     * @param target
     */
    public CglibInterceptor(Object target) {
        this.target = target;
    }

    /**
     * 拦截器
     * 1、目标对象的方法调用
     * 2、增强行为
     * @param o 由CGLib动态生成的代理类实例
     * @param method 实体类所调用的被代理的方法引用
     * @param objects 参数值列表
     * @param methodProxy 生成的代理类对方法的代理引用
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("方法执行前。。。");
        Object result = method.invoke(target, objects);
        System.out.println("方法执行后。。。");
        return result;
    }

    public Object getProxy(){
        // 通过Enhancer对象的create()方法可以生成一个类，用于生成代理对象
        Enhancer enhancer = new Enhancer();
        // 设置父类 (没有父类将目标类作为其父类)
        enhancer.setSuperclass(target.getClass());
        //设置拦截器 回调对象为本身对象
        enhancer.setCallback(this);
        // 生成一个代理类对象，并返回
        return enhancer.create();
    }
}
