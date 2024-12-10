package com.sherlock.design.creational.singleton;

import com.sherlock.design.creational.singleton.enumsingleton.EnumSingleton;
import com.sherlock.design.creational.singleton.hungersingleton.AnitDeserializedHungerSingleton;
import com.sherlock.design.creational.singleton.hungersingleton.HungerSingleton;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
@Slf4j
public class SerializableReflect {


    public static void main(String[] args) {
        try {
            log.info("======================序列化、反序列化攻击===========================");
            ObjectOutputStream oos = null;
            ObjectInputStream ois = null;
            try {
                HungerSingleton hungerSingleton = HungerSingleton.getInstance();
                // 序列化对象
                oos = new ObjectOutputStream(new FileOutputStream("hungerSingleton.ser"));
                oos.writeObject(hungerSingleton);
                // 反序列化对象
                ois = new ObjectInputStream(new FileInputStream("hungerSingleton.ser"));
                HungerSingleton deserializedHungerSingleton = (HungerSingleton) ois.readObject();
                log.info("hungerSingleton:{}",hungerSingleton);
                log.info("Serializable attack hungerSingleton:{}",deserializedHungerSingleton);
            }catch (IOException e){
                log.error("error:{}",e.getMessage(),e);
            } catch (ClassNotFoundException e) {
                log.error("error:{}",e.getMessage(),e);
            } finally {
                // 关闭流
                if (oos != null) oos.close();
                if (ois != null) ois.close();
            }
        }catch (IOException e){
            log.error("error:{}",e.getMessage(),e);
        }


        try {
            log.info("======================防序列化、反序列化攻击===========================");
            ObjectOutputStream oos = null;
            ObjectInputStream ois = null;
            try {
                AnitDeserializedHungerSingleton anitDeserializedHungerSingleton = AnitDeserializedHungerSingleton.getInstance();
                // 序列化对象
                oos = new ObjectOutputStream(new FileOutputStream("anitDeserializedHungerSingleton.ser"));
                oos.writeObject(anitDeserializedHungerSingleton);
                // 反序列化对象
                ois = new ObjectInputStream(new FileInputStream("anitDeserializedHungerSingleton.ser"));
                AnitDeserializedHungerSingleton deserializedHungerSingleton = (AnitDeserializedHungerSingleton) ois.readObject();
                log.info("hungerSingleton:{}",anitDeserializedHungerSingleton);
                log.info("Serializable attack hungerSingleton:{}",deserializedHungerSingleton);
            }catch (IOException e){
                log.error("error:{}",e.getMessage(),e);
            } catch (ClassNotFoundException e) {
                log.error("error:{}",e.getMessage(),e);
            } finally {
                // 关闭流
                if (oos != null) oos.close();
                if (ois != null) ois.close();
            }
        }catch (IOException e){
            log.error("error:{}",e.getMessage(),e);
        }

        try {
            log.info("======================防序列化、反序列化攻击(枚举)===========================");
            ObjectOutputStream oos = null;
            ObjectInputStream ois = null;
            try {
                EnumSingleton enumSingleton = EnumSingleton.getInstance();
                // 序列化对象
                oos = new ObjectOutputStream(new FileOutputStream("enumSingleton.ser"));
                oos.writeObject(enumSingleton);
                // 反序列化对象
                ois = new ObjectInputStream(new FileInputStream("enumSingleton.ser"));
                EnumSingleton deserializedEnumSingleton = (EnumSingleton) ois.readObject();
                log.info("enumSingleton:{}",enumSingleton);
                log.info("Serializable attack enumSingleton:{}",deserializedEnumSingleton);
            }catch (IOException e){
                log.error("error:{}",e.getMessage(),e);
            } catch (ClassNotFoundException e) {
                log.error("error:{}",e.getMessage(),e);
            } finally {
                // 关闭流
                if (oos != null) oos.close();
                if (ois != null) ois.close();
            }
        }catch (IOException e){
            log.error("error:{}",e.getMessage(),e);
        }
    }

}
