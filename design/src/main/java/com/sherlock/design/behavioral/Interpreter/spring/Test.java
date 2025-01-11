package com.sherlock.design.behavioral.Interpreter.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@Slf4j
public class Test {

    public static void main(String[] args) {
        ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("(11 + 100) * 6");
        log.info("结果：{}",expression.getValue());
    }

}
