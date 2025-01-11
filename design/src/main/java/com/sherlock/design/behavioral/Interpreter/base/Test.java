package com.sherlock.design.behavioral.Interpreter.base;

import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        String str = "6 100 11 + *";
        ExpressionParser expressionParser = new ExpressionParser();
        expressionParser.parse(str);
    }

}
