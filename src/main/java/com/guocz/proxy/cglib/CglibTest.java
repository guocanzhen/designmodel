package com.guocz.proxy.cglib;

/**
 * @author guocz
 * @date 2022/9/13 11:31
 */
public class CglibTest {

    public static void main(String[] args) throws Exception {
        Me me = new Me("definition word");
        Me me1 = CglibProxyCreator.create(Me.class, new CglibInterceptor(me));
        me1.move();
    }
}
