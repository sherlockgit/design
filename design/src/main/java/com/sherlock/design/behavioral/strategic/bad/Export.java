package com.sherlock.design.behavioral.strategic.bad;


import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
public class Export {

    public void toExport(String key){
        if (Objects.equals(key,"ORDER")) {
            log.info("订单导出");
        }else if(Objects.equals(key,"GOODS")){
            log.info("商品导出");
        }else if(Objects.equals(key,"USER")){
            log.info("用户导出");
        }
    }

}
