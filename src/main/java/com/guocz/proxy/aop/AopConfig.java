package com.guocz.proxy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author guocz
 * @date 2022/9/23 15:27
 * AOP的advisor和advice配置
 */
@Component
@Aspect
public class AopConfig {

    /**
     * 定义切面
     */
//    @Pointcut("execution(* com.guocz.proxy.aop.AopObjectImpl.*(..))")
    @Pointcut("execution(* com.guocz.proxy.aop.AopObject.*(..))")
    public void myPoint(){
    }

    @Before("myPoint()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("before in");
    }

}
