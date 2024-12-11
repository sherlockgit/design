package com.sherlock.design.creational.prototype.deepcloneprototype;

import com.sherlock.design.creational.prototype.base.Goods;
import com.sherlock.design.creational.prototype.shallowcloneprototype.ShallowCloneGoods;
import lombok.Data;

import java.util.Date;

@Data
public class DeepCloneOrder implements Cloneable{

    private String no;

    private Date createDate;

    private DeepCloneGoods goods;

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepCloneOrder deepCloneOrder = (DeepCloneOrder) super.clone();
        deepCloneOrder.setCreateDate((Date) deepCloneOrder.getCreateDate().clone());
        deepCloneOrder.setGoods((DeepCloneGoods)deepCloneOrder.getGoods().clone());
        return deepCloneOrder;
    }
}
