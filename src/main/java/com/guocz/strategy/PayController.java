package com.guocz.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author guocz
 * @date 2022/9/1 14:39
 */
@RestController
@RequestMapping
public class PayController {

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 支付接口
     * @param amount
     * @param paymentType
     * @return
     */
    @RequestMapping("/pay")
    public PayResult pay(@RequestParam("amount") BigDecimal amount,
                         @RequestParam("paymentType") String paymentType) {
        Order order = new Order();
        order.setAmount(amount);
        order.setPayType(paymentType);

        // 根据支付类型获取对应的策略 bean
        IPayment payment = applicationContext.getBean(order.getPayType(), IPayment.class);

        // 开始支付
        return payment.pay(order);
    }
}
