package com.guocz.proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author guocz
 * @date 2022/9/1 15:06
 */
public class ProxyDemo {

    public static void main(String[] args) throws Exception {
        // 静态代理
        Person student = new Student("张三");
        StudentProxy studentProxy = new StudentProxy(student);
        studentProxy.giveMoney();

        // 动态代理
        Person studentDynamic = new StudentDynamic("张三");
        InvocationHandler invocationHandler = new StuInvocationHandler<>(studentDynamic);
        Person o = (Person)Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, invocationHandler);
        o.giveMoney();
        // 输出动态生成代理类的字节码文件
        byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        File file = new File("D:\\file\\$Proxy0.class");
        if (!file.exists()) {
            file.createNewFile();
        }else {
            file.delete();
        }
        FileOutputStream fos = new FileOutputStream(file.getAbsolutePath());
        fos.write($Proxy0s);
        fos.flush();
        fos.close();
    }
}
