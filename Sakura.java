package com.company;

public class Sakura extends Character {

    public Sakura() {
        super(new JustJutsu(), new EarthElement());
    }

    @Override
    void display() {
        System.out.println("Sakura chan");
    }
}
