package com.guocz.strategy;

import org.springframework.stereotype.Component;

/**
 * @author guocz
 * @date 2022/9/1 14:36
 * 支付宝实现
 */
@Component("AliPay")
public class AliPay implements IPayment{
    @Override
    public PayResult pay(Order order) {
        return new PayResult("支付宝支付成功");
    }
}
