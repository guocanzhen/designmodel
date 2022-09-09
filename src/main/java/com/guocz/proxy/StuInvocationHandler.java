package com.guocz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author guocz
 * @date 2022/9/1 15:36
 */
public class StuInvocationHandler<T> implements InvocationHandler {

    T target;

    public StuInvocationHandler(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行" + method.getName() + "方法");
        MonitorUtil.start();
        Object invoke = method.invoke(target, args);
        MonitorUtil.finish(method.getName());
        return invoke;
    }
}
