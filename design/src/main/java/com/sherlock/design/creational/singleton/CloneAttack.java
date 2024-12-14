package com.sherlock.design.creational.singleton;

import com.sherlock.design.creational.singleton.hungersingleton.AnitCloneHungerSingleton;
import com.sherlock.design.creational.singleton.hungersingleton.CloneHungerSingleton;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class CloneAttack {
    public static void main(String[] args) {
        try {
            log.info("======================克隆攻击===========================");
            log.info("HungerSingleton:{}", CloneHungerSingleton.getInstance());
            log.info("reflect attack HungerSingleton:{}",CloneHungerSingleton.getInstance().clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        log.info("======================防克隆攻击===========================");
        log.info("HungerSingleton:{}", AnitCloneHungerSingleton.getInstance());
        log.info("reflect attack HungerSingleton:{}",AnitCloneHungerSingleton.getInstance().clone());
    }

}
