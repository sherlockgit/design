package com.sherlock.design.creational.abstractfactory.evolution;

import org.apache.ibatis.session.SqlSessionFactory;

public class Test {

    public static void main(String[] args) {
      OperatorFactory factory = new GoodsOperatorFactory();
      factory.createExport().export();
      factory.createImport().toImport();
    }

}
