package com.sherlock.design.behavioral.memento.base;

import lombok.Data;

@Data
public class Content {

    private String content;


    public void edit(String content){
        this.content = content;
    }

    public ContentMemento save(){
        return new ContentMemento(content);
    }

    public void undo(ContentMemento contentMemento){
        this.content = contentMemento.getContent();
    }
}
