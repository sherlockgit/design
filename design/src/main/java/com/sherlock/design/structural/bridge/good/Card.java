package com.sherlock.design.structural.bridge.good;

public abstract class Card {
    Package aPackage;

    public Card(Package aPackage) {
        this.aPackage = aPackage;
    }

    abstract void pay();

}
