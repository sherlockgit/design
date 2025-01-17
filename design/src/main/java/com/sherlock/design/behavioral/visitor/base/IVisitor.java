package com.sherlock.design.behavioral.visitor.base;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2025/1/17 17:27
 */
public interface IVisitor {

    void visit(GoodsOrder goodsOrder);

    void visit(MemberOrder memberOrder);

}
