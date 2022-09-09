package com.guocz.strategy;

import org.springframework.stereotype.Component;

/**
 * @author guocz
 * @date 2022/9/1 14:35
 * 微信支付实现
 */
@Component("WechatPay")
public class WechatPay implements IPayment{

    @Override
    public PayResult pay(Order order) {
        return new PayResult("微信支付成功");
    }
}
