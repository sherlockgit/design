package com.sherlock.design.behavioral.memento.base;

import java.util.Stack;

public class ContentManager {


    private final Stack<ContentMemento> HISTORY = new Stack<>();

    public void add(ContentMemento contentMemento){
        HISTORY.push(contentMemento);
    }

    public ContentMemento get(){
        return HISTORY.pop();
    }

}
