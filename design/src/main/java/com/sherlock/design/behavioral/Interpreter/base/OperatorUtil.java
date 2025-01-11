package com.sherlock.design.behavioral.Interpreter.base;

public class OperatorUtil {

    public static boolean isOperator(String item){
        if (item.equals("+") || item.equals("*")) {
            return true;
        }
        return false;
    }

    public static Interpreter getExpressionObject(Interpreter firstExpression,Interpreter secondExpression,String item){
        if ("*".equals(item)) {
            return new MulitInterpreter(firstExpression,secondExpression);
        }else if ("+".equals(item)){
            return new AddInterpreter(firstExpression,secondExpression);
        }
        return null;
    }

}
