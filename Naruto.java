package com.company;

public class Naruto extends Character {

    public Naruto() {
        super(new JustJutsu(), new WindElement());
    }

    @Override
    void display() {
        System.out.println("DATTEBAYO!");
    }
}
