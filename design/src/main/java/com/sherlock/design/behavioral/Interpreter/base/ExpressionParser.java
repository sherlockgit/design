package com.sherlock.design.behavioral.Interpreter.base;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class ExpressionParser {

    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for (String item : strItemArray){
            if (!OperatorUtil.isOperator(item)) {
                Interpreter numberExpression = new NumberInterpreter(item);
                stack.push(numberExpression);
                log.info("入栈：{}",numberExpression.interpret());
            }else {
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                log.info("出栈：{} 和 {}",firstExpression.interpret(),secondExpression.interpret());
                Interpreter result = OperatorUtil.getExpressionObject(firstExpression,secondExpression,item);
                stack.push(new NumberInterpreter(result.interpret()));
                log.info("阶段结果入栈：{}",result.interpret());
            }
        }
        int result = stack.pop().interpret();
        log.info("最终结果：{}",result);
        return result;
    }

}
