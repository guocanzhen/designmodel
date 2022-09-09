package com.guocz;

import com.guocz.proxy.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author guocz
 * @date 2022/9/1 15:06
 */
public class ProxyDemo {

    public static void main(String[] args) {
        // 静态代理
//        Person student = new Student("张三");
//        StudentProxy studentProxy = new StudentProxy(student);
//        studentProxy.giveMoney();

        // 动态代理
        Person studentDynamic = new StudentDynamic("张三");
        InvocationHandler invocationHandler = new StuInvocationHandler<>(studentDynamic);
        Person o = (Person)Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, invocationHandler);
        o.giveMoney();
    }
}
