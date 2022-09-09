package com.guocz.strategy;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author guocz
 * @date 2022/9/1 14:33
 * 订单信息类
 */
@Data
public class Order {

    private BigDecimal amount;

    private String payType;
}
