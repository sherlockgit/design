package com.sherlock.design.behavioral.Interpreter.base;

public class MulitInterpreter implements Interpreter{

    private Interpreter firstExpression,secondExpression;

    public MulitInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return firstExpression.interpret()*secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
