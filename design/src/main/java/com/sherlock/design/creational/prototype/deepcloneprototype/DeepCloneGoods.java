package com.sherlock.design.creational.prototype.deepcloneprototype;

import lombok.Data;

@Data
public class DeepCloneGoods implements Cloneable{

    private String goodsName;

    private Integer num;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
