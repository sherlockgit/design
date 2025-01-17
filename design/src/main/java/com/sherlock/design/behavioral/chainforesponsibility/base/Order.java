package com.sherlock.design.behavioral.chainforesponsibility.base;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/17 16:34
 */
@Data
public class Order {

    private String payment;

    private BigDecimal amount;

    private String goods;

}
