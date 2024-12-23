package com.sherlock.design.structural.combined.base;

import org.apache.ibatis.scripting.xmltags.SqlNode;

public class Test {

    public static void main(String[] args) {
        System addButton = new Button("添加");
        System deleteButton = new Button("删除");
        System updateButton = new Button("修改");

        System mainMenu = new menu("主菜单",0);
        System ceo = new menu("董事长",1);
        System president1 = new menu("技术副总裁",2);
        System president2 = new menu("销售副总裁",2);
        System department1 = new menu("技术部",3);
        System department2 = new menu("测试部",3);
        System department3 = new menu("销售一队",3);
        System department4 = new menu("销售二队",3);

        mainMenu.add(ceo);
        ceo.add(president1);
        ceo.add(president2);
        president1.add(department1);
        president1.add(department2);
        president2.add(department3);
        president2.add(department4);

        ceo.add(addButton);
        ceo.add(deleteButton);
        ceo.add(updateButton);

        president1.add(addButton);
        president1.add(deleteButton);
        president1.add(updateButton);

        president2.add(addButton);
        president2.add(deleteButton);
        president2.add(updateButton);

        department1.add(addButton);
        department1.add(deleteButton);
        department1.add(updateButton);

        department2.add(addButton);
        department2.add(deleteButton);
        department2.add(updateButton);

        department3.add(addButton);
        department3.add(deleteButton);
        department3.add(updateButton);

        department4.add(addButton);
        department4.add(deleteButton);
        department4.add(updateButton);

        mainMenu.print();
    }

}
