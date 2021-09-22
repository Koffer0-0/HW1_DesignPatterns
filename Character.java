package com.company;

public abstract class Character {
    private JutsuStrategy jutsu;
    private ChakraElements chakra;

    public Character(JutsuStrategy jutsu, ChakraElements chakra) {
        this.jutsu = jutsu;
        this.chakra = chakra;
    }

    public void performJutsu() {
        this.jutsu.usejutsu();
    }
    public void performElement() {
        this.chakra.element();
    }

    public void setJutsu(JutsuStrategy jutsu) {
        this.jutsu = jutsu;
    }

    public void setChakra(ChakraElements chakra) {
        this.chakra = chakra;
    }

    public ChakraElements getChakra() {
        return chakra;
    }

    public JutsuStrategy getJutsu() {
        return jutsu;
    }

    abstract void display();
}
