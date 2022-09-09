package com.guocz.strategy;

/**
 * @author guocz
 * @date 2022/9/1 14:32
 * 策略接口
 */
public interface IPayment {

    PayResult pay(Order order);
}
