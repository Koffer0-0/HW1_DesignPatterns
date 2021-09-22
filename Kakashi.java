package com.company;

public class Kakashi extends Character {
    public Kakashi() {
        super(new JustJutsu(), new EarthElement());
    }

    @Override
    void display() {
        System.out.println("I'am Kakashi");
    }
}
