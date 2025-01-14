package com.sherlock.design.behavioral.memento.base;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

    public static void main(String[] args) {
        ContentManager contentManager = new ContentManager();

        Content content = new Content();
        content.edit("内容A");
        contentManager.add(content.save());
        log.info("content:{}",content);
        content.edit("内容B");
        log.info("content:{}",content);
        content.undo(contentManager.get());
        log.info("content:{}",content);
    }

}
