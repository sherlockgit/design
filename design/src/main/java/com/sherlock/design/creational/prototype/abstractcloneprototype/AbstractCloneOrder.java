package com.sherlock.design.creational.prototype.abstractcloneprototype;

import lombok.Data;

import java.util.Date;

@Data
public class AbstractCloneOrder extends OrderCloneable{

    private String no;

    private Date createDate;

    private AbstractCloneGoods goods;

    @Override
    public Object clone() throws CloneNotSupportedException {
        AbstractCloneOrder deepCloneOrder = (AbstractCloneOrder) super.clone();
        deepCloneOrder.setCreateDate((Date) deepCloneOrder.getCreateDate().clone());
        deepCloneOrder.setGoods((AbstractCloneGoods)deepCloneOrder.getGoods().clone());
        return deepCloneOrder;
    }
}
