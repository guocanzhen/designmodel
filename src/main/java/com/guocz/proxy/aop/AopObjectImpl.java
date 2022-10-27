package com.guocz.proxy.aop;

import org.springframework.stereotype.Service;

/**
 * @author guocz
 * @date 2022/9/23 15:41
 * 被代理拦截对象
 */
@Service
public class AopObjectImpl implements AopObject{

    @Override
    public void aoped(){
        System.out.println("logic");
    }

    @Override
    public void dfa() {
        System.out.println("wdefrghn");
    }

    @Override
    public void eg() {
        System.out.println("ergh");
    }
}
