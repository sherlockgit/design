package com.sherlock.design.creational.prototype.base;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Order {

    private String no;

    private Date createDate;

    private Goods goods;

}
