package com.guocz.strategy;

import org.springframework.stereotype.Component;

/**
 * @author guocz
 * @date 2022/9/1 14:37
 * 云闪付实现
 */
@Component("UnionPay")
public class UnionPay implements IPayment{
    @Override
    public PayResult pay(Order order) {
        return new PayResult("云闪付支付成功");
    }
}
