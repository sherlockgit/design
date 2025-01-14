package com.sherlock.design.behavioral.memento.base;

import lombok.Getter;

@Getter
public class ContentMemento {

    private String content;

    public ContentMemento(String content) {
        this.content = content;
    }
}
