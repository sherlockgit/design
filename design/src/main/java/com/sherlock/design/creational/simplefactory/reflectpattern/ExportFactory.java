package com.sherlock.design.creational.simplefactory.reflectpattern;

public class ExportFactory {

    public Export create(Class clazz){
        try {
           return (Export) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
