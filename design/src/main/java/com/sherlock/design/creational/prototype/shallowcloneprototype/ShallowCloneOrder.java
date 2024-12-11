package com.sherlock.design.creational.prototype.shallowcloneprototype;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class ShallowCloneOrder implements Cloneable{

    private String no;

    private Date createDate;

    private ShallowCloneGoods goods;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
