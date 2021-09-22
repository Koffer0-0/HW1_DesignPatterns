package com.company;

public class Sasuke extends Character {
    public Sasuke() {
        super(new Dojutsu(), new LightningElement());
    }

    @Override
    void display() {
        System.out.println("I'am Sasuke");
    }
}
